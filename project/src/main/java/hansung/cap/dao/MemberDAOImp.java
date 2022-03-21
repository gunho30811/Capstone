package hansung.cap.dao;

import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import hansung.cap.project.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImp implements MemberDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "hansung.cap.mapper.MemberMapper";
	
	@Override
	public MemberVO login(MemberVO vo){
		return sqlSession.selectOne(namespace+".login",vo);
	}
    @Override
    public void InsertId(MemberVO vo){
    	sqlSession.insert(namespace+".insertMember", vo);
    }
    @Override
    public int idCheck(MemberVO vo) {
    	int result = sqlSession.selectOne(namespace+".idCheck", vo);
		return result;
    }
    
}
