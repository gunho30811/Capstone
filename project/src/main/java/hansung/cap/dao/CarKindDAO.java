package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.CarKindVO;


public interface CarKindDAO {
	public List<CarKindVO> Querrycar(String msg);
	public List<CarKindVO> QuerryAll();
	public List<CarKindVO> paging(int paging);
	public int countBoard(CarKindVO vo);
}
