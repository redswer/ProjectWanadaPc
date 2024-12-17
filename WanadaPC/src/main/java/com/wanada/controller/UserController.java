package com.wanada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; //1번 연동 생성 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.UserDTO;
import com.wanada.service.UserService;
import com.wanada.util.UserSHA256;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller // 1번
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("/userInsertPage")
	public String userInsertPage() { // public String 인 이유눈 public은 한 프로젝트 내에서 사용가능, private는 한 클래스 내에서만 사용가능//
										// String인 이유는 리턴값이 주소갑세(문자)이기 때문에
		return "User/user_insert";
	}

	@RequestMapping("/user_insert") // user_insert.html 에서 입력받는 값의 name 을 입력함.
	public String userInsert(HttpServletRequest request, Model model) { // httpservletrequest 요청값 / model 만들어야함 확인한번해보기
		// insert.html 페이지에서 입력받은 값을 가져오는것
		String email = request.getParameter("userEmail") + "@" + request.getParameter("customEmailDomain");
		String password = request.getParameter("userPassword"); // 비밀번호 암호화 인코딩 작업 해야함.
		String hashedPassword = UserSHA256.getSHA256(password); 
		String name = request.getParameter("userName");
		String birthdate = request.getParameter("userBirthdate");
		String gender = request.getParameter("gender");
		String tell = request.getParameter("tell");
		
		// get으로 가져온 값들을 set으로 UserDTO dto변수에 넣는 작업
		UserDTO dto = new UserDTO();// UserDTO dto 변수선언
		
		dto.setUserEmail(email);
		dto.setUserPassword(hashedPassword);
		dto.setUserName(name);
		dto.setUserBirthdate(birthdate);
		dto.setGender(gender);
		dto.setTell(tell);

		int row = service.userWirte(dto);

		model.addAttribute("row", row);

		return "User/user_insert_pro";
	}

	@RequestMapping("/userLoginPage")
	public String userLoginPage() {
		return "User/user_login";
	}

	@RequestMapping("/user_login") // user_login.html 에서Thymeleaf로 입력받는 action값을 적음.
	// 1, 입력된 값을 가져오기. 2, select sql문 실행한값 끌어오기 / select passwd from tbl_user where
	// userid=?
	// 3. 입력된 값이랑 select한 값이 동일한지(equals 사용 ?)
	// if써서 비교? 같으면 return값이 1로 나오고 1이면 로그인 성공 0이면로그인 실패 {email이 다른경우/ 도메인이 다른경우/
	// 비밀번호가 다른경우}
	public String userLogin(HttpServletRequest request, Model model) {

		// <<<< 1. 입력된 아이디 페스워드 값을 변수에 저장 필요성 의문 >>>>
		String email = request.getParameter("userEmail") + "@" + request.getParameter("customEmailDomain");
		String password = request.getParameter("userPassword");

		String hashedPassword = UserSHA256.getSHA256(password); // SHA-256 암호화

				
		UserDTO dto = service.userLogin(email);
		HttpSession session = request.getSession();
		int row = 0; //비밀번호 실패 
		
		if (dto == null) {
			row = -1; //없는 아이디 
		} else {
			if (dto.getUserPassword().equals(hashedPassword)) {
				session.setAttribute("user", dto);
				session.setMaxInactiveInterval(60 * 30);
				row = 1; // 로그인 성공 
			}
		}
		
		model.addAttribute("row", row);
		
		return "User/user_login_pro";
	}
	
	@RequestMapping("/user_logout")
	public String userLogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "User/user_logout";
	}
	// 마이페이지로 이동 
	@RequestMapping("/userMyPage")
	public String myPage() {
		return "User/myPage"; //폴더내의 마이페이지.jsp or html로 이동하는 코드
	}
	
	// 마이페이지에서 - > 회원정보수정으로 이동 
	@RequestMapping("/user_update_page")// myPage.html 에서 th:href=""내용과 일치시켜야함 86번쨰 줄 
	public String updatepage() {
	return "User/user_update"; 
	}
	
	//회원장보 수정시 정보 업데이트 
	@RequestMapping("/user_update") 
	public String update(HttpServletRequest request, Model model) {
		String userEmail = request.getParameter("userEmail");
		//String currentPassword  = request.getParameter("userPassword"); 	
		String repassword = request.getParameter("userRepassword"); // 새 비밀번호
		String hashedPassword = UserSHA256.getSHA256(repassword); // 새 비밀번호 암호화 
		String name = request.getParameter("userName");
		String gender = request.getParameter("gender");
		String tell = request.getParameter("tell");
		/*
		// 로그인 할때 입력한 비밀번호와 회원 정보 수정에서 (현재 비밀번호) 란에 입력란 값이 같은지 확인 하는 작업. // 수정 241215
	    UserDTO existingUser = service.userLogin(userEmail); // DB에서 이메일로 사용자 검색
	    // 현재 비밀번호 대조 /추가 수정 241215
	    if (existingUser == null || !existingUser.getUserPassword().equals(UserSHA256.getSHA256(currentPassword))) {
	        model.addAttribute("row", 0); // 비밀번호 불일치 시 row = 0
	        return "User/user_update_pro";
	    }
		*/
		//비밀번호 일치 시 없데이트 진행 
		UserDTO dto = new UserDTO();// UserDTO dto 변수선언
		dto.setUserEmail(userEmail);
		dto.setUserPassword(hashedPassword);
		dto.setUserName(name);
		dto.setGender(gender);
		dto.setTell(tell);

		int row = service.update(dto); //업데이트 실행
		HttpSession session = request.getSession();
		session.setAttribute("user", service.userLogin(userEmail));
		model.addAttribute("row", row);	//성공 여부 전달 
		return "User/user_update_pro"; // 결과 펭지로 이동 /폴더 내의 파일 명과 일치 시켜야함.
	}

	@RequestMapping("pwCheckPage")
	public String pwCheckPage() {
		
		return "/User/pwCheck";
	}
	
	@RequestMapping("userPwCheck")
	public String userPwCheck(HttpServletRequest request, Model model) {
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		UserDTO dto = (UserDTO) session.getAttribute("user");
		String id = dto.getUserEmail();
		
		String hashedPassword = UserSHA256.getSHA256(password); // SHA-256 암호화

		
		UserDTO user = service.userLogin(id);
		int row = 0;
		
		if (user.getUserPassword().equals(hashedPassword)) {
			row = 1;
		}
		
		model.addAttribute("row", row);
		
		return "/User/pwCheck_pro";
	}
	
}

// controller 에서 row 값(0,1)