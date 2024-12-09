package com.wanada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.BoardDTO;
import com.wanada.dto.UserDTO;
import com.wanada.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;

	@RequestMapping("boardList")
	public String boardlist(Model model) {

		List<BoardDTO> list = service.boardlist();

		model.addAttribute("board_list", list);

		return "Board/boardList";
	}

	@RequestMapping("boardUpdate")
	public String boardupdate(HttpServletRequest request, Model model) {

	    // HttpServletRequest에서 idx 파라미터를 받아오기
	    int idx = Integer.parseInt(request.getParameter("idx"));

	    // idx를 사용하여 서비스 호출
	    int update = service.boardupdate(idx);
	    model.addAttribute("boardupdate", update);

	    return "Board/boardupdate";
	}


	@RequestMapping("boardDetail")
	public String boarddetail(HttpServletRequest request, Model model) {
	    // "boarddetail" 파라미터를 가져와서 int로 변환
		int idx = Integer.parseInt(request.getParameter("board_index"));
		 BoardDTO detail = service.boarddetail(idx);
		    model.addAttribute("dto", detail);
	    
	    return "Board/boardDetail";
	}
	@RequestMapping("boardDelete")
	public String boarddelete(HttpServletRequest request, Model model) {
	    // idx 값을 받아서 서비스로 삭제 요청
		int idx = Integer.parseInt(request.getParameter("board_index"));
	    int delete = service.boarddelete(idx);
	    
	    // 삭제 성공시, 적절한 처리가 필요할 수 있음 (여기서는 빈 블록을 제거)
	    if (delete == 1) {
	        // 삭제 성공 시 추가 로직을 여기에 작성할 수 있습니다.
	    } else {
	        // 삭제 실패 시 "Board/boarddelete" 페이지로 이동
	        return "Board/boarddelete";
	    }
	    
	    // 삭제 결과를 모델에 추가
	    model.addAttribute("boarddelete", delete);        
	    return "Board/boarddelete";
	}
	
	@RequestMapping("boardUpdatePage")
	public String boardUpdatePage(HttpServletRequest request, Model model) {
		int idx = Integer.parseInt(request.getParameter("board_index"));
		 BoardDTO detail = service.boarddetail(idx);
		    model.addAttribute("dto", detail);
		return "Board/boardUpdate";
	}
	@RequestMapping("boardinsertpage")
	public String boardinsertpage(HttpServletRequest request, Model model) {
		return "Board/boardInsert";

}
	@RequestMapping("boardinsert")
	public String boardinsert(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO) session.getAttribute("user");
		
		String theme = request.getParameter("theme"); 
		String content = request.getParameter("content");
		String person = user.getUserEmail();
		
		BoardDTO dto = new BoardDTO();
		dto.setTheme(theme);
		dto.setPerson(person);
		dto.setContent(content);
		
		int row = service.boardinsert(dto);
		return "Board/boardInsert";
}
}