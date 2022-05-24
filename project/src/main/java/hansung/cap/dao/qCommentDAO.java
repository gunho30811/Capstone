package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.qCommentVO;



public interface qCommentDAO {
	public void InsertComment(qCommentVO vo);
	public List<qCommentVO> CommentAll(int a);
	public void delete(int s);
	public void deleteAll(int a);
}
