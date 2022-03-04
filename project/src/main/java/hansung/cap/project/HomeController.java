package hansung.cap.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hansung.cap.dao.CarKindDAO;
import hansung.cap.dao.CommentDAO;
import hansung.cap.dao.MemberDAO;
import hansung.cap.dao.MemberDAOImp;
import hansung.cap.dao.QnADAO;
import hansung.cap.dao.listDAO;
import hansung.cap.dao.listDAOimp;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private listDAO lDao; //차량 리스트 DAO
	@Inject
	private MemberDAO mDao; //회원가입 및 로그인 DAO
	@Inject 
	private QnADAO qDao; //QnA DAO
	@Inject
	private CarKindDAO cDao; //차 데이터 확인 DAO
	@Inject
	private CommentDAO rDao; //리플 관련 DAO
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	//---------------------------------firstpage 띄우기-------------------------------------//
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest httpServletRequest, Model model, HttpServletResponse response) {
		 
		MemberVO mVo=new MemberVO();
		
		String option=httpServletRequest.getParameter("option");
		System.out.println(httpServletRequest.getParameter("userId")+","+httpServletRequest.getParameter("userPw"));
		System.out.println();
		
		HttpSession session=httpServletRequest.getSession();
		
		String user_id;
		
		
		if(option==null) {
			System.out.println("first page loading");
		}
		
		else if(option.equals("login")) {
			mVo.userId=httpServletRequest.getParameter("userId");
			mVo.userPw=httpServletRequest.getParameter("userPw");
			MemberVO login = new MemberVO();
			login=mDao.login(mVo);
			String s = "no";
			if(login == null) {
				System.out.println("hey");
				model.addAttribute("failFlag",s);
			}
			else {
				session.setAttribute("userId", mVo.userId);
				user_id=(String)session.getAttribute("userId");
				System.out.println(user_id);
				model.addAttribute("id",user_id);
				return "menu";
				
			}
			
		}
		
		else if(option.equals("logOut")) {
			System.out.println("log Out!!!");
			session.invalidate();
			System.out.println("session delete");
			
			return "firstpage";
		}
			
		
		System.out.println("first page return");
		//model.addAttribute("serverTime", formattedDate );
		
		return "firstpage";
	}
	/*
	@RequestMapping(value = "menu", method = RequestMethod.GET)
	public String menu(HttpServletRequest httpServletRequest, Model model) {
		loginMap loginMap1 = loginMap.getInstance();
		
		String option=httpServletRequest.getParameter("option");
		
		model.addAttribute("option",option);
		
		
		System.out.println("second page return");
		//model.addAttribute("serverTime", formattedDate );
		
		return "menu";
	}*/
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(HttpServletRequest httpServletRequest, Model model) {
		HttpSession session=httpServletRequest.getSession();
		String user_id=(String)session.getAttribute("userId"); ;
		model.addAttribute("id",user_id);
		return "menu";
	}
	
	//-----------------------------------------차량 리스트 띄우기--------------------------------------------------//
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(HttpServletRequest httpServletRequest, Model model) {
		HttpSession session=httpServletRequest.getSession();
		String user_id=(String)session.getAttribute("userId"); //아이디 세션 불러오기
		
		
		System.out.println("----------------------------------"+user_id);
		if(user_id==null) {
			return "firstpage";
		}
		
		
		
		List<listVO> list = new ArrayList<listVO>();
		
		listVO vo=new listVO();
		//DataMap dataMap = DataMap.getInstance();
		
		String option=httpServletRequest.getParameter("option");
		int firstIndex=0;
		int lastIndex=9;
		list = lDao.QueryAll();
		
		
		if(option==null) {
			
		}
		/*
		else if(option.equals("search")) {
			List<listVO> searchList = new ArrayList();
			System.out.println(httpServletRequest.getParameter("name"));
			for(int i=0;i<dataMap.list.size();i++) {
				if(httpServletRequest.getParameter("name").equals(dataMap.list.get(i).carNum)||httpServletRequest.getParameter("name").equals(dataMap.list.get(i).carColor)||httpServletRequest.getParameter("name").equals(dataMap.list.get(i).carKind)||httpServletRequest.getParameter("name").equals(dataMap.list.get(i).carMaster)){
					searchList.add(dataMap.list.get(i));
				}
			}
			model.addAttribute("list",searchList);
			return "list";
		}*/
		
		else if (option.equals("search")) {
			String msg=  httpServletRequest.getParameter("name");
			System.out.println(msg);
			list = lDao.searchName("%"+msg+"%");
			System.out.println(list);
		}
		
		else if(option.equals("page")) {
			int pageNum=Integer.parseInt(httpServletRequest.getParameter("pageNum"));
			System.out.println(pageNum);
			firstIndex=(pageNum-1)*10;
			lastIndex=firstIndex+9;
			System.out.println(firstIndex);
			System.out.println(lastIndex);
		}
		
		else if(option.equals("carKind")) {
			List<CarKindVO> clist = new ArrayList<CarKindVO>();
			String kind=httpServletRequest.getParameter("kind");
			System.out.println(kind);
			clist=cDao.Querrycar(kind);
			/*if(clist.isEmpty()) {
				kind="";
			}*/
			
			model.addAttribute("id",kind);
			model.addAttribute("list",clist);
			return "carKind";
		}

	
		model.addAttribute("id",user_id);
		model.addAttribute("list",list);
		model.addAttribute("firstIndex",firstIndex);
		model.addAttribute("lastIndex", lastIndex);
		System.out.println("third page return");
		//model.addAttribute("serverTime", formattedDate );
		
		return "list";
	}

	
//--------------------------------회원가입-----------------------------//
	
	@RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	public String signUp(HttpServletRequest httpServletRequest, Model model) {
		String option=httpServletRequest.getParameter("option");
		
		MemberVO mVo=new MemberVO();
		
		
		if(option==null) {
			
		}
		else if(option.equals("signUp")) {
			mVo.userId=httpServletRequest.getParameter("userId");
			mVo.userPw=httpServletRequest.getParameter("userPw");
			System.out.println(mVo.userId);
			mDao.InsertId(mVo);
			return "firstpage";
		}
		return "Signup";
	}
	
//-------------------------------QnA List---------------------------------------------//
	@RequestMapping(value = "/QnAList", method = RequestMethod.GET)
	public String QnAList(HttpServletRequest httpServletRequest, Model model,HttpServletResponse response) throws ServletException,IOException{
		List<QnAVO> list = new ArrayList<QnAVO>();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=httpServletRequest.getSession();
		String user_id=(String)session.getAttribute("userId"); //아이디 세션 불러오기
		
		
		System.out.println("----------------------------------"+user_id);
		if(user_id==null) {
			return "firstpage";
		}
		
		QnAVO qVo=new QnAVO();
		//DataMap dataMap = DataMap.getInstance();
		
		String option=httpServletRequest.getParameter("option");
		int firstIndex=0;
		int lastIndex=9;
		list = qDao.QueryAll();
			
		
		if(option==null) {
			
		}
		
		else if(option.equals("gotoEnroll")) {
			model.addAttribute("id",user_id);
			return "QnA";
		}
		else if(option.equals("enroll")) {                 //QnA 등록하기
			qVo.title=httpServletRequest.getParameter("title");
			qVo.content=httpServletRequest.getParameter("content");
			qVo.userId=httpServletRequest.getParameter("writer");
			qVo.time=httpServletRequest.getParameter("time");
			
			System.out.println(qVo.time);
			qDao.enrollQnA(qVo);  //insert qna
			list = qDao.QueryAll();
			model.addAttribute("id",user_id);
			model.addAttribute("list",list);
			model.addAttribute("firstIndex",firstIndex);
			model.addAttribute("lastIndex", lastIndex);
			System.out.println(list);
			return "QnAList";
		}
		
		else if(option.equals("page")) {      //QnA 리스트 페이지
			int pageNum=Integer.parseInt(httpServletRequest.getParameter("pageNum"));
			System.out.println(pageNum);
			firstIndex=(pageNum-1)*10;
			lastIndex=firstIndex+9;
			System.out.println(firstIndex);
			System.out.println(lastIndex);
		}
		
		else if(option.equals("search")) {     //QnA 검색
			System.out.println("search if 실행");
			String searchTag=httpServletRequest.getParameter("name");
			System.out.println(searchTag);
			list = qDao.search("%"+searchTag+"%");
		}
		
		else if(option.equals("read")) {      //QnA 열람
			List<CommentVO> rlist = new ArrayList<CommentVO>();
			int keyword=Integer.parseInt(httpServletRequest.getParameter("keyword"));
			System.out.println(keyword);
			QnAVO qRead=new QnAVO();
			qRead=qDao.read(keyword);
			rlist=rDao.CommentAll(keyword);
			model.addAttribute("CommentVO",rlist);
			model.addAttribute("id",user_id);
			model.addAttribute("QnAVO",qRead);
			return "QnARead";
		}
		
		else if(option.equals("delete")) {    //QnA 삭제
			int deleter=Integer.parseInt(httpServletRequest.getParameter("index"));
			System.out.println(deleter);
			qDao.delete(deleter);
			list = qDao.QueryAll();
			rDao.delete(deleter);
			model.addAttribute("list",list);
			model.addAttribute("firstIndex",firstIndex);
			model.addAttribute("lastIndex", lastIndex);
			return "QnAList";
		}
		
		else if(option.equals("comment")) {   //댓글 등록
			List<CommentVO> rlist = new ArrayList<CommentVO>();
			CommentVO rvo= new CommentVO();
			rvo.userId=user_id;
			rvo.text=httpServletRequest.getParameter("text");
			rvo.QnANum=Integer.parseInt(httpServletRequest.getParameter("QnANum"));
			System.out.println("리플 등록자 : "+rvo.userId);
			System.out.println("text : "+rvo.text);
			rDao.InsertComment(rvo);
			rlist=rDao.CommentAll(rvo.QnANum);
			
			QnAVO qRead=new QnAVO();
			qRead=qDao.read(rvo.QnANum);
			model.addAttribute("CommentVO",rlist);
			model.addAttribute("id",user_id);
			model.addAttribute("QnAVO",qRead);
			return "QnARead";
		}
		
		else if(option.equals("delComment")) {
			int delComment=Integer.parseInt(httpServletRequest.getParameter("index"));
			System.out.println(delComment);
			rDao.delete(delComment);
			
			List<CommentVO> rlist = new ArrayList<CommentVO>();
			int keyword=Integer.parseInt(httpServletRequest.getParameter("QnANum"));
			System.out.println(keyword);
			QnAVO qRead=new QnAVO();
			qRead=qDao.read(keyword);
			rlist=rDao.CommentAll(keyword);
			model.addAttribute("CommentVO",rlist);
			model.addAttribute("id",user_id);
			model.addAttribute("QnAVO",qRead);
			return "QnARead";
			
		}
		
				
		model.addAttribute("list",list);
		model.addAttribute("firstIndex",firstIndex);
		model.addAttribute("lastIndex", lastIndex);
		System.out.println("QnA list");
		return "QnAList";
	}
	
	
}







