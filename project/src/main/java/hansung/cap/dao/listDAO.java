package hansung.cap.dao;

import hansung.cap.project.MemberVO;
import hansung.cap.project.listVO;
import java.util.List;

public interface listDAO {
	
	public List<listVO> QueryAll();
	public List<listVO> searchName(String msg);
}
