package hansung.cap.project;

import java.util.ArrayList;
import java.util.List;

public class loginMap {
	public static List<MemberVO> list=new ArrayList<MemberVO>();
	
	
	private static loginMap instance = new loginMap();
	
	public static loginMap getInstance() {
		return instance;
	} 
	public loginMap() {
		//list.add(new MemberVO("qudqud97","qwe123"));
		//list.add(new MemberVO("rtw2343","1234"));
	}
}
