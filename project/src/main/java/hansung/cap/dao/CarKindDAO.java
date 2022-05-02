package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.CarKindVO;


public interface CarKindDAO {
	public List<CarKindVO> Querrycar(String msg);
	public List<CarKindVO> QuerryAll();
}
