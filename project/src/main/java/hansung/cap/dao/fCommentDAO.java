package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.fCommentVO;

public interface fCommentDAO {
	public void InsertComment(fCommentVO vo);
	public List<fCommentVO> querryAll();
	public void DelComment(int a);
	public List<fCommentVO> querry(int a);
}
