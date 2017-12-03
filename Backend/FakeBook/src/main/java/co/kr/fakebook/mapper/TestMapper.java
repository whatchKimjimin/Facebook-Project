package co.kr.fakebook.mapper;

import java.util.List;

import co.kr.fakebook.dto.TestDTO;

public interface TestMapper {
	public List<TestDTO> selectUsers();
    public void insertUser(TestDTO data);
}
