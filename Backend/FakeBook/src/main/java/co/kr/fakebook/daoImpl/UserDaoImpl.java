package co.kr.fakebook.daoImpl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.fakebook.dao.UserDao;
import co.kr.fakebook.dto.UsersDTO;



@Repository("UserDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<UsersDTO> getUsers() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getUserList");
	}

	@Override
	public UsersDTO getUser(int id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getUser",id);
	}

	

}
