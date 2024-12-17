package com.wanada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.SsdDTO;
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
	
	@RequestMapping("/Product_COOLER")
	public String productCOOLER(Model model) {
		List<CoolerDTO> coolerList = productService.getComputerCoolerProducts();
		model.addAttribute("COOLER", coolerList);
		return "Product/Product_COOLER";
	}
	
	@RequestMapping("/Product_GPU")
	public String productGPU(Model model) {
		List<GpuDTO> gpuList = productService.getComputerGpuProducts();
		model.addAttribute("GPU", gpuList);
		return "Product/Product_GPU";
	}
	
	@RequestMapping("/Product_HDD")
	public String productHDD(Model model) {
		List<HddDTO> hddList = productService.getComputerHddProducts();
		model.addAttribute("HDD", hddList);
		return "Product/Product_HDD";
	}
	
	@RequestMapping("/Product_MB")
	public String productMB(Model model) {
		List<MainBoardDTO> mbList = productService.getComputerMBProducts();
		model.addAttribute("MB", mbList);
		return "Product/Product_MB";
	}
	
	@RequestMapping("/Product_POWER")
	public String productPOWER(Model model) {
		List<PowerDTO> powerList = productService.getComputerPowerProducts();
		model.addAttribute("POWER", powerList);
		return "Product/Product_POWER";
	}
	
	@RequestMapping("/Product_RAM")
	public String productRAM(Model model) {
		List<RamDTO> ramList = productService.getComputerRamProducts();
		model.addAttribute("RAM", ramList);
		return "Product/Product_RAM";
	}
	
	@RequestMapping("/Product_SSD")
	public String productSSD(Model model) {
		List<SsdDTO> ssdList = productService.getComputerSsdProducts();
		model.addAttribute("SSD", ssdList);
		return "Product/Product_SSD";
	}
	
	
	@GetMapping("/Product_CPU_Detail")
	public String getCpuDetail(@RequestParam("CPU_NAME") String name, Model model) {
        CpuDTO cpuDetail = productService.getComputerCpuProductsAll(name);
        model.addAttribute("cpuDetail", cpuDetail);
        return "Product/Product_CPU_Detail";
    }
	
	
}