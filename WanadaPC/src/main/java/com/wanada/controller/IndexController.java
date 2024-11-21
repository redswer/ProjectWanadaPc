package com.wanada.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;
import com.wanada.dto.RecommandPcDTO;
import com.wanada.service.IndexService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class IndexController {
	private static final Logger log = LoggerFactory.getLogger("ThymeleafController");
	
	@Autowired
	private IndexService service;
	
	@RequestMapping({"/", "/index"})
	public String index(Model model) {
		log.info("index 호출됨");
		
		List<IndexBannerDTO> list = service.indexBannerList();
		List<IndexGamePcDTO> list2 = service.indexGamePcList();
		List<RecommandPcDTO> list3 = service.recommandPcGameList();
		List<RecommandPcDTO> list4 = service.recommandPcPartsList();
		
		model.addAttribute("indexBannerList", list);
		model.addAttribute("indexGamePcList", list2);
		model.addAttribute("recommandPcGameList", list3);
		model.addAttribute("recommandPcPartsList", list4);
		
		return "index";
	}
	
	@RequestMapping("/etcPC")
	public String etcPC(HttpServletRequest request) {
		log.info("etcPC 호출됨");
		
		String category = request.getParameter("category");
		
		return "Pc/etcPC?category=" + category;
	}
	
	@RequestMapping("/windowGuide")
	public String windowGuide() {
		return "Pc/windowGuide";
	}
	
	@RequestMapping("/windowInstall")
	public String windowInstall() {
		return "Pc/windowInstall";
	}
}
