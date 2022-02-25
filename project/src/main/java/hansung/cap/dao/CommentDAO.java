package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.CommentVO;



public interface CommentDAO {
	public void InsertComment(CommentVO vo);
	public List<CommentVO> CommentAll(int i);
	public void delete(int s);
}
