package com.wanada.service;

import com.wanada.dto.UserDTO;

public interface UserService { 
	//UserService는 중간다리역할   mapper.java에도 똑같은 문구가 입력되어있지만 mapper.java는  mapper.xml와 연동되어서 sql문을 실행시키기 위해 만든것 
	//따라서 controller 에서 service의 의존성을 주입받은것은 mapper.xml에서 쿼리문 경과값을 받아서 변수에 담고 이 row값을 받기위해서임.
	public int userWirte(UserDTO dto);
	
	public UserDTO userLogin(String userEmail); 
	
	
	public UserDTO userPassword(String userEmail); // 비밀번호 검색하는것  (입력된 아이디를 기준으로 해당 비밀번호 검색해서 가지고 오기 떄문에 String userEmail) 입력해야함 

}
