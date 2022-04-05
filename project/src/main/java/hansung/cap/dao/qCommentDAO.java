package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.qCommentVO;



public interface qCommentDAO {
	public void InsertComment(qCommentVO vo);
	public List<qCommentVO> CommentAll(int i);
	public void delete(int s);
}
