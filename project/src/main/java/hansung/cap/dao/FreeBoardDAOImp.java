package hansung.cap.dao;


import java.util.List;


import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;

import hansung.cap.project.FreeBoardVO;

import org.springframework.stereotype.Repository;

@Repository
public class FreeBoardDAOImp implements FreeBoardDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "hansung.cap.mapper.FreeBoardMapper";
	
	@Override
	public List<FreeBoardVO> QueryAll(){
		return sqlSession.selectList(namespace+".queryAll");
	}
	
	@Override
	public void insert(FreeBoardVO vo) {
		sqlSession.insert(namespace+".insertFreeBoard",vo);
	}
	
	@Override
	public List<FreeBoardVO> Search(String s){
		return sqlSession.selectList(namespace+".searchAll",s);
	}
	@Override
	public FreeBoardVO Read(int a){
		return sqlSession.selectOne(namespace+".read",a);
	}
	
	@Override
	public void deleteFree(int a) {
		sqlSession.delete(namespace+".delete",a);
	}
	
	@Override
	public void modify(FreeBoardVO vo) {
		sqlSession.update(namespace+".modify",vo);
	}
	
	public List<FreeBoardVO> paging(int paging){
		return sqlSession.selectList(namespace+".paging", paging);
	}
	
	@Override
	public int countBoard(FreeBoardVO vo) {
		int result = sqlSession.selectOne(namespace+".countBoard", vo);
		return result;
	}
}
