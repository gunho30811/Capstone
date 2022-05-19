package hansung.cap.dao;

import hansung.cap.project.MemberVO;
import hansung.cap.project.listVO;
import java.util.List;

public interface listDAO {
	
	public List<listVO> QueryAll();
	public List<listVO> QueryModel(String model);
	public List<listVO> QueryTime(String time);
	public List<listVO> paging(int paging);
	public List<listVO> searchName(String msg);
	public int countBoard(listVO vo);
}
