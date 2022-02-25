package hansung.cap.dao;
import java.util.List;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;

import hansung.cap.project.MemberVO;
import hansung.cap.project.listVO;
import org.springframework.stereotype.Repository;

@Repository
public class listDAOimp implements listDAO {
	@Inject // 의존관계를 자동으로 연결(JAVA에서 제공) ==@autowired (Spring에서 제공)
    private SqlSession sqlSession;
   
   
    private static final String namespace = "hansung.cap.mapper.listMapper";
                                            //memberMapper.xml의 namespace값
   /*
    @Override
    public void insertList(listVO vo) {
        sqlSession.insert(namespace+".insertList", vo);
    }
    */
    @Override
    public List<listVO> QueryAll() {
    			
    	return sqlSession.selectList(namespace+".queryAll");
    }
    @Override
    public List<listVO> searchName(String msg) {
    	
		return sqlSession.selectList(namespace+".searchName",msg);
    }


}
