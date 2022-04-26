package hansung.cap.dao;


import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;

import hansung.cap.project.qCommentVO;

import org.springframework.stereotype.Repository;

@Repository
public class qCommentDAOImp implements qCommentDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="hansung.cap.mapper.qCommentMapper";
	
	@Override
	public void InsertComment(qCommentVO vo) {
		sqlSession.insert(namespace+".insertComment",vo);
	}
	
	@Override
	public List<qCommentVO> CommentAll(int a){
		return sqlSession.selectList(namespace+".CommentAll",a);
	}
	
	@Override
	public void delete(int s) {
		sqlSession.delete(namespace+".delete",s);
	}
}
