package hansung.cap.dao;

import hansung.cap.project.MemberVO;
import hansung.cap.project.listVO;
import java.util.List;

public interface listDAO {
	
	public List<listVO> QueryAll();
	public List<listVO> paging(int paging);
	public List<listVO> searchName(String msg);
	public int countBoard(listVO vo);
}
