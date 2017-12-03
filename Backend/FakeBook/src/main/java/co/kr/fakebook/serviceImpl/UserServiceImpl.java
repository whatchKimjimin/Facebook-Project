package co.kr.fakebook.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.fakebook.dao.UserDao;
import co.kr.fakebook.dto.UsersDTO;
import co.kr.fakebook.service.UserService;


@Service("userService")

public class UserServiceImpl implements UserService {
	
	@Resource(name = "UserDao")
	private UserDao userDao;

	@Override
	public List<UsersDTO> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	@Override
	public UsersDTO getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

}
