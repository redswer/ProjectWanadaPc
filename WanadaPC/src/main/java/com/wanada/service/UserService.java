package com.wanada.service;

import com.wanada.dto.UserDTO;


public interface UserService { 
	//UserService는 중간다리역할   mapper.java에도 똑같은 문구가 입력되어있지만 mapper.java는  mapper.xml와 연동되어서 sql문을 실행시키기 위해 만든것 
	//따라서 controller 에서 service의 의존성을 주입받은것은 mapper.xml에서 쿼리문 경과값을 받아서 변수에 담고 이 row값을 받기위해서임.
	public int userWirte(UserDTO dto);
	
	public UserDTO userLogin(String userEmail); 
	
	

}
