package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.FreeBoardVO;

public interface FreeBoardDAO {
	public List<FreeBoardVO> QueryAll();
	public void insert(FreeBoardVO vo);
	public List<FreeBoardVO> Search(String s);
	public FreeBoardVO Read(int a);
}
