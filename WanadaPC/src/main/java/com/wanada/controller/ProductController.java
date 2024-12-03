package com.wanada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.service.ProductService;

@Controller
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/Product_main")
	public String productMain(Model model) {

		return "Product/Product_main";
	}

	@RequestMapping("/Product_CPU")
	public String productCPU(Model model) {
		List<CpuDTO> cpuList = productService.getComputerCpuProducts();
		model.addAttribute("CPU", cpuList);
		return "Product/Product_CPU";
	}

	@RequestMapping("/Product_CASE")
	public String productCASE(Model model) {
		List<CaseDTO> caseList = productService.getComputerCaseProducts();
		model.addAttribute("CASE", caseList);
		return "Product/Product_CASE";
	}
}