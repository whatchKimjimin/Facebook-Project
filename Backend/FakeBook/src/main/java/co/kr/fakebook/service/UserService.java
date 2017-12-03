package co.kr.fakebook.service;

import java.util.List;

import co.kr.fakebook.dto.UsersDTO;

public interface UserService {
	// All UserData get
	public List<UsersDTO> getUsers();
	// UserData	get Only One
	public UsersDTO getUser(int id);
}
