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
	public List<QnAVO> searchTitle(String s){
		return sqlSession.selectList(namespace+".searchTitle",s);
	}
	
	@Override
	public List<QnAVO> searchUser(String s){
		return sqlSession.selectList(namespace+".searchUser",s);
	}
	@Override
	public QnAVO read(int s){
		return sqlSession.selectOne(namespace+".read",s);
	}
	
	@Override
	public void delete(int s) {
		sqlSession.delete(namespace+".delete",s);
	}
	
	@Override
	public void modify(QnAVO vo) {
		sqlSession.update(namespace+".modify",vo);
	}
	
	public List<QnAVO> paging(int paging){
		return sqlSession.selectList(namespace+".paging", paging);
	}
	
	@Override
	public int countBoard(QnAVO vo) {
		int result = sqlSession.selectOne(namespace+".countBoard", vo);
		return result;
	}
	@Override
	public int ScountBoard1(String msg) {
		int result = sqlSession.selectOne(namespace+".ScountBoard1", msg);
		return result;
	}
	@Override
	public int ScountBoard2(String msg) {
		int result = sqlSession.selectOne(namespace+".ScountBoard2", msg);
		return result;
	}
	@Override
	public int ScountBoard3(String msg) {
		int result = sqlSession.selectOne(namespace+".ScountBoard3", msg);
		return result;
	}
}
