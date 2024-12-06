package com.wanada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.BoardDTO;
import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.RecommandPcDTO;
import com.wanada.dto.SsdDTO;
import com.wanada.service.IndexService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class IndexController {
	@Autowired
	private IndexService service;
	
	@RequestMapping({"/", "/index"})
	public String index(Model model) {
		List<IndexBannerDTO> list = service.indexBannerList();
		List<IndexGamePcDTO> list2 = service.indexGamePcList();
		List<RecommandPcDTO> list3 = service.recommandPcGameList();
		List<RecommandPcDTO> list4 = service.recommandPcPartsList();
		
		List<BoardDTO> blist = service.indexBoardList();
		
		for (int i = 0; i < blist.size(); i++) {
			if (blist.get(i).getTheme().length() >= 10) {
				blist.get(i).setTheme(blist.get(i).getTheme().substring(0, 10) + "...");
			}
			
			if (blist.get(i).getContent().length() >= 25) {
				blist.get(i).setContent(blist.get(i).getContent().substring(0, 25) + "...");
			}
		}
		
		List<BoardDTO> list5 = blist.subList(0, 4);
		List<BoardDTO> list6 = blist.subList(4, 8);
		
		
		model.addAttribute("indexBannerList", list);
		model.addAttribute("indexGamePcList", list2);
		model.addAttribute("recommandPcGameList", list3);
		model.addAttribute("recommandPcPartsList", list4);
		model.addAttribute("indexBoardList_1", list5);
		model.addAttribute("indexBoardList_2", list6);
		
		return "index";
	}
	
	@RequestMapping("/etcPC")
	public String etcPC(HttpServletRequest request, Model model) {
		String category = request.getParameter("category");
		String url = "Pc/etcPC_1";
		IndexBannerDTO dto = service.etcPC(category);
		List<IndexBannerDTO> list = service.indexBannerList();
		List<RecommandPcDTO> list2 = service.recommandPcPartsList();
		
		if(category.equals("home")) {
			url = "Pc/etcPC_home";
		} else if (category.equals("office")) {
			url = "Pc/etcPC_office";
		} else if (category.equals("ryzen")) {
			url = "Pc/etcPC_2";
		} else if (category.equals("intel")) {
			url = "Pc/etcPC_3";
		} else if (category.equals("edit")) {
			url = "Pc/etcPC_edit";
		}
		
		model.addAttribute("index_banner_list", list);
		model.addAttribute("dto", dto);
		model.addAttribute("index_category", category);
		model.addAttribute("recommand_pc_parts_list", list2);
		
		return url;
	}
	
	@RequestMapping("/gamePC")
	public String gamePC(HttpServletRequest request, Model model) {
		String category = request.getParameter("category");
		String url = "Pc/gamePC_4";
		IndexGamePcDTO dto = service.gamePC(category);
		List<IndexGamePcDTO> list = service.indexGamePcList();
		List<RecommandPcDTO> list2 = service.recommandPcGameList();
		
		if(category.equals("leagueOfLegend")) {
			url = "Pc/gamePC_4";
		} else if (category.equals("battleGround")) {
			url = "Pc/gamePC_1";
		} else if (category.equals("blackMyth")) {
			url = "Pc/gamePC_3";
		} else if (category.equals("godOfWar")) {
			url = "Pc/gamePC_2";
		}
		
		model.addAttribute("index_game_pc_list", list);
		model.addAttribute("dto", dto);
		model.addAttribute("category", category);
		model.addAttribute("recommand_pc_game_list", list2);
		
		return url;
	}
	
	@RequestMapping("/windowGuide")
	public String windowGuide() {
		return "Pc/windowGuide";
	}
	
	@RequestMapping("/windowInstall")
	public String windowInstall() {
		return "Pc/windowInstall";
	}
	
	@RequestMapping("/search")
	public String search(String text, Model model) {
		List<BoardDTO> list = service.searchBoard(text);
		List<CaseDTO> caseList = service.searchCase(text);
		List<CoolerDTO> coolerList = service.searchCooler(text);
		List<CpuDTO> cpuList = service.searchCpu(text);
		List<GpuDTO> gpuList = service.searchGpu(text);
		List<HddDTO> hddList = service.searchHdd(text);
		List<MainBoardDTO> mainboardList = service.searchMainBoard(text);
		List<PowerDTO> powerList = service.searchPower(text);
		List<RamDTO> ramList = service.searchRam(text);
		List<SsdDTO> ssdList = service.searchSsd(text);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTheme().length() >= 10) {
				list.get(i).setTheme(list.get(i).getTheme().substring(0, 10) + "...");
			}
			
			if (list.get(i).getContent().length() >= 40) {
				list.get(i).setContent(list.get(i).getContent().substring(0, 40) + "...");
			}
		}
		
		model.addAttribute("text", text);
		model.addAttribute("board", list);
		model.addAttribute("case", caseList);
		model.addAttribute("cooler", coolerList);
		model.addAttribute("cpu", cpuList);
		model.addAttribute("gpu", gpuList);
		model.addAttribute("hdd", hddList);
		model.addAttribute("mainboard", mainboardList);
		model.addAttribute("power", powerList);
		model.addAttribute("ram", ramList);
		model.addAttribute("ssd", ssdList);
		
		return "Util/search_result";
	}
}
