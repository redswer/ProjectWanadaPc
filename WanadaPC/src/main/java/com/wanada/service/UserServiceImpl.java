package com.wanada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.UserDTO;
import com.wanada.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired //생성자/setter/필드  의 경우에 사용 의존성 주입하는거
	private UserMapper mapper;
	
	@Override // 함수 덮어 씌우고 재정의 하는 부분에서 @Overloading  와 다름 
	public int userWirte(UserDTO dto) {
		int row = mapper.userWrite(dto); //mapper에서는 sql문이 동작(insert)의 결과값을 userwite(dto)에 저장한다. 
										 //userwrite(dto)의 값을 row에 담아서 controller로 던져줌. 그렇기때문에 mapper에서 
		
		return row;
	}
	
	@Override
	public UserDTO userLogin(String userEmail) {
		UserDTO row = mapper.userLogin(userEmail); //mapper에서는 sql 문이 동작(select)의 결과값을 userwirte(dto)에 저장한다. 
	
		
		return row;
	
	}
}
