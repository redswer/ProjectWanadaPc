package com.wanada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.service.IndexService;

@Controller
public class BoardController {
	@Autowired
	private IndexService service;
	
	@RequestMapping("boardList")
	public String boardlist() {
		
		return "Board/boardlist";
	}
}
