package hansung.cap.dao;

import java.util.List;

import hansung.cap.project.CarKindVO;


public interface CarKindDAO {
	public List<CarKindVO> Querrycar(String msg);  //차 이름으로 검색
	public List<CarKindVO> QuerryMaker(String msg);  // 제조사로 검색
	public List<CarKindVO> QuerryAll();
	public List<CarKindVO> paging(int paging);
	public int countBoard(CarKindVO vo);
}
