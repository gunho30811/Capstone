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

}
