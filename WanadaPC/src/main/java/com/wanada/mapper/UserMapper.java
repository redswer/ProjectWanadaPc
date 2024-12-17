package com.wanada.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.wanada.dto.UserDTO;

@Mapper
public interface UserMapper {// UserMapper.xml의 Userwite 쿼리와 연결
	public int userWrite(UserDTO dto);//controller 에서 선언한 변수 
	
	public UserDTO userLogin(String userEmail);  // 반환값 ( 1=성공, 0=비밀번호 틀림, -1=아이디없음)
	
	public String userLogout();
	
	public String mypage();
	
	public int update(UserDTO dto);
	
	/*
	//수정 1215
	public interface UserMapper {
	    public UserDTO userLogin(String userEmail); // 현재 사용자 정보 가져오기
	    public int update(UserDTO dto);            // 사용자 정보 업데이트
	}
	*/
}
