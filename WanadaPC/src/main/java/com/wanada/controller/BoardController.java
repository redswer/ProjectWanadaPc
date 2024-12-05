package com.wanada.controller;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.BoardDTO;
import com.wanada.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;

	@RequestMapping("boardList")
	public String boardlist(Model model) {

		List<BoardDTO> list = service.boardlist();

		model.addAttribute("boardlist", list);

		return "Board/boardlist";
	}

	@RequestMapping("boardUpdate")
	public String boardupdate(Model model) {

		int update = service.boardupdate();
		model.addAttribute("boardupdate", update);

		return "Board/boardupdate";
	}
	@RequestMapping("boardInsert")
	public String boardinsert(Model model) {
		
		int insert=service.boardinsert();
		model.addAttribute("boardinsert", insert);
		
		return "Board/boardinsert";
	}
	@RequestMapping("boardDetail")
	public String boarddetail(Model model) {
		
		int detail=service.boarddetail();
		model.addAttribute("boarddetail", detail);
		
		return "Board/boarddetail";

}
	@RequestMapping("boardDelete")
	public String boarddelete(Model model) {
		
		int delete=service.boarddelete();
		model.addAttribute("boarddelete", delete);
		
		return "Board/boarddelete";
	}
}