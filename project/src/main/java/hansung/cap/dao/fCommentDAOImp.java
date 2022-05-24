package hansung.cap.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import hansung.cap.project.fCommentVO;
@Repository
public class fCommentDAOImp implements fCommentDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="hansung.cap.mapper.fCommentMapper";
	
	@Override
	public void InsertComment(fCommentVO vo) {
		
		sqlSession.insert(namespace+".insertfComment",vo);
		
	}
	
	@Override
	public List<fCommentVO> querryAll() {
		return sqlSession.selectList(namespace+".queryAll");
	}
	
	@Override
	public List<fCommentVO> querry(int a){
		return sqlSession.selectList(namespace+".querry",a);
	}
	
	@Override
	public void DelComment(int a) {
		sqlSession.delete(namespace+".deleteComment",a);
	}
	
	@Override
	public void DelCommentAll(int a) {
		sqlSession.delete(namespace+".deleteAll",a);
	}

}
