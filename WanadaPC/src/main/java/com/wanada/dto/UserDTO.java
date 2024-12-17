package com.wanada.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDTO {
	private String userEmail;
	private String userPassword;
	private String gender;
	private String userName;
	private String tell;
	private String userBirthdate;
	public String getUserEmail(String string) {
		return null;
	} 
}
