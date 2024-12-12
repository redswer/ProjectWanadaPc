package com.wanada.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.wanada.dto.UserDTO;

@Mapper
public interface UserMapper {// UserMapper.xml의 Userwite 쿼리와 연결
	public int userWrite(UserDTO dto);//controller 에서 선언한 변수 
	
	public UserDTO userLogin(String userEmail);  // 반환값 ( 1=성공, 0=비밀번호 틀림, -1=아이디없음)
	
	
}
