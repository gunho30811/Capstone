package hansung.cap.dao;
import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;

import hansung.cap.project.CarKindVO;

import org.springframework.stereotype.Repository;

@Repository
public class CarKindDAOImp implements CarKindDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="hansung.cap.mapper.CarKindMapper";
	
	@Override
	public List<CarKindVO> Querrycar(String msg){
		return sqlSession.selectList(namespace+".queryCAR",msg);
	}
	
	@Override
	public List<CarKindVO> QuerryMaker(String msg){
		return sqlSession.selectList(namespace+".queryMaker",msg);
	}
	@Override
	public List<CarKindVO> QuerryAll(){
		return sqlSession.selectList(namespace+".querryAll");
	}
	public List<CarKindVO> paging(int paging){
		return sqlSession.selectList(namespace+".paging", paging);
	}
	
	@Override
	public int countBoard(CarKindVO vo) {
		int result = sqlSession.selectOne(namespace+".countBoard", vo);
		return result;
	}
}
