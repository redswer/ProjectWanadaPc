package com.wanada.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.IndexBannerDTO;
import com.wanada.service.IndexService;

@Controller
public class IndexController {
	private static final Logger log = LoggerFactory.getLogger("ThymeleafController");
	
	@Autowired
	private IndexService service;
	
	@RequestMapping("/")
	public String index(Model model) {
		log.info("index 호출됨");
		
		List<IndexBannerDTO> list = service.indexBannerList();
		model.addAttribute("indexBannerList", list);
		return "index";
	}
}
