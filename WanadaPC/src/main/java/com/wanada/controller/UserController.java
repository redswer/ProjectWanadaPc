package com.wanada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; //1번 연동 생성 
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.UserDTO;
import com.wanada.service.UserService;


@Controller   //1번 
public class UserController {
	
	@Autowired
	private UserService service; 
	
	@RequestMapping("/UserLogin")
	public String UserLogin() {
		return "User/user_login"; //폴더 /파일 이름     폴더 앞에는 / 있으면 안된다 
		
	}
	@RequestMapping("/UserLoginOK")
	public String UserLoginOk() {
		return "User/user_login_ok";    // 로그인 확인을 하는 부분 
	}
	

	@RequestMapping("/user_insert") //회원가입 값 넣는것 
	public String UserWrite() {			//UserMapper.java에서 row값을 UserDTO dto로 받아서 UserWrite라는 이름으로 지정 해당 값을 불러옴 
		UserDTO dto = new UserDTO();
		int row = service.UserWrite(dto);
		
		if(-1 != row) {
			// TODO 성공했을 경우 처리
			return "User/user_insert";   // 회원가입 mapping 
		}else {
			// TODO DB에러일 경우 처리
			return "데이터베이스 접근에 실패하였습니다.";   // 회원가입 mapping 
		}
		
		
	}
	@RequestMapping("/UserInsertPage") //회원가입 페이지로 이동하는것 = 회원가입 페이지는 user_insert.html
	public String UwerWritePage() {
		return "User/user_insert";
		
	}
}
// controller 에서 row 값(0,1)