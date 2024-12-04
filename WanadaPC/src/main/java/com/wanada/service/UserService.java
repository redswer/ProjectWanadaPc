package com.wanada.service;

import com.wanada.dto.UserDTO;

public interface UserService {
	
	//1. 회원 등록 
	public int UserWrite(UserDTO dto) ;
	/*	int row = 0;
		String sql = "Insert into user_table(userEmail, userPassword, userName, userBirthdate, gender, tell)"
				+ "	values(?,?,?,?,?,?)";
	*/				
	//2. 회원 로그인 
	public int login(String userid, String Password);
	

	

}
