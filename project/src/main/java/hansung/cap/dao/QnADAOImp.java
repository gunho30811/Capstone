package hansung.cap.dao;

import java.util.List;


import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import hansung.cap.project.QnAVO;
import org.springframework.stereotype.Repository;

@Repository
public class QnADAOImp implements QnADAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "hansung.cap.mapper.QnAMapper";
	
	@Override
	public void enrollQnA(QnAVO vo) {
		sqlSession.insert(namespace+".insertQnA",vo);
	}
	
	@Override
	public List<QnAVO> QueryAll(){
		return sqlSession.selectList(namespace+".queryAll");
	}
	
	@Override
	public List<QnAVO> search(String s){
		return sqlSession.selectList(namespace+".search",s);
	}
	
	@Override
	public QnAVO read(int s){
		return sqlSession.selectOne(namespace+".read",s);
	}
	
	@Override
	public void delete(int s) {
		sqlSession.delete(namespace+".delete",s);
	}
}
