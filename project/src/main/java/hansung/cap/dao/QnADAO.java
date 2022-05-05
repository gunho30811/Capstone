package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.QnAVO;

public interface QnADAO {
	public void enrollQnA(QnAVO vo);
	public List<QnAVO> QueryAll();
	public List<QnAVO> search(String s);
	public QnAVO read(int s);
	public void delete(int s);
	public void modify(QnAVO vo);
	public List<QnAVO> paging(int paging);
	public int countBoard(QnAVO vo);
}
