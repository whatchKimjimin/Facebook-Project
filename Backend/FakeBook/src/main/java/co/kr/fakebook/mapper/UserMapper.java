package co.kr.fakebook.mapper;

import java.util.List;
import java.util.Map;

import co.kr.fakebook.dto.UsersDTO;

public interface UserMapper {
	// All UserDate get
	public List<Map<String, Object>> selectUsers();
	// Create User
	public void insertUser(UsersDTO userData);
}
