package hansung.cap.dao;

import hansung.cap.project.MemberVO;
import java.util.List;

public interface MemberDAO {
	public MemberVO login(MemberVO vo);
	public void InsertId(MemberVO vo);
	public int idCheck(MemberVO vo);
}
