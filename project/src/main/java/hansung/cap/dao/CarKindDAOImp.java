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
	public List<CarKindVO> QuerryAll(){
		return sqlSession.selectList(namespace+".querryAll");
	}
}
