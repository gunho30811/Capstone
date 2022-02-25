package hansung.cap.dao;


import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;

import hansung.cap.project.CommentVO;

import org.springframework.stereotype.Repository;

@Repository
public class CommentDAOImp implements CommentDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="hansung.cap.mapper.CommentMapper";
	
	@Override
	public void InsertComment(CommentVO vo) {
		sqlSession.insert(namespace+".insertComment",vo);
	}
	
	@Override
	public List<CommentVO> CommentAll(int i){
		return sqlSession.selectList(namespace+".CommentAll",i);
	}
}
