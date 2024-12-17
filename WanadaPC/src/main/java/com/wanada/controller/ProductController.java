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
	
	//필터 페이지
	@RequestMapping("/Product_main")
	public String productMain(Model model) {

		return "Product/Product_main";
	}
	//CPU 페이지
	@RequestMapping("/Product_CPU")
	public String productCPU(Model model) {
		List<CpuDTO> cpuList = productService.getComputerCpuProducts();
		model.addAttribute("CPU", cpuList);
		return "Product/Product_CPU";
	}
	//CASE 페이지
	@RequestMapping("/Product_CASE")
	public String productCASE(Model model) {
		List<CaseDTO> caseList = productService.getComputerCaseProducts();
		model.addAttribute("CASE", caseList);
		return "Product/Product_CASE";
	}
	//COOLER 폐이지
	@RequestMapping("/Product_COOLER")
	public String productCOOLER(Model model) {
		List<CoolerDTO> coolerList = productService.getComputerCoolerProducts();
		model.addAttribute("COOLER", coolerList);
		return "Product/Product_COOLER";
	}
	//GPU 페이지
	@RequestMapping("/Product_GPU")
	public String productGPU(Model model) {
		List<GpuDTO> gpuList = productService.getComputerGpuProducts();
		model.addAttribute("GPU", gpuList);
		return "Product/Product_GPU";
	}
	//HDD 페이지
	@RequestMapping("/Product_HDD")
	public String productHDD(Model model) {
		List<HddDTO> hddList = productService.getComputerHddProducts();
		model.addAttribute("HDD", hddList);
		return "Product/Product_HDD";
	}
	//메인보드 페이지
	@RequestMapping("/Product_MB")
	public String productMB(Model model) {
		List<MainBoardDTO> mbList = productService.getComputerMBProducts();
		model.addAttribute("MB", mbList);
		return "Product/Product_MB";
	}
	//파워 페이지
	@RequestMapping("/Product_POWER")
	public String productPOWER(Model model) {
		List<PowerDTO> powerList = productService.getComputerPowerProducts();
		model.addAttribute("POWER", powerList);
		return "Product/Product_POWER";
	}
	//RAM 페이지
	@RequestMapping("/Product_RAM")
	public String productRAM(Model model) {
		List<RamDTO> ramList = productService.getComputerRamProducts();
		model.addAttribute("RAM", ramList);
		return "Product/Product_RAM";
	}
	//SSD 페이지
	@RequestMapping("/Product_SSD")
	public String productSSD(Model model) {
		List<SsdDTO> ssdList = productService.getComputerSsdProducts();
		model.addAttribute("SSD", ssdList);
		return "Product/Product_SSD";
	}	
	//CPU 상세페이지
	@GetMapping("/Product_CPU_Detail")
	public String getCpuDetail(@RequestParam("CPU_NAME") String name, Model model) {
        CpuDTO cpuDetail = productService.getComputerCpuProductsAll(name);
        model.addAttribute("cpuDetail", cpuDetail);
        return "Product/Product_CPU_Detail";
    }
	//CASE 상세페이지
	@GetMapping("/Product_CASE_Detail")
	public String getCaseDetail(@RequestParam("CASE_NAME") String name, Model model) {
		CaseDTO caseDetail = productService.getComputerCaseProductsAll(name);
        model.addAttribute("caseDetail", caseDetail);
        return "Product/Product_CASE_Detail";
    }
	//COOLER 상세페이지
	@GetMapping("/Product_COOLER_Detail")
	public String getCoolerDetail(@RequestParam("COOLER_NAME") String name, Model model) {
		CoolerDTO coolerDetail=productService.getComputerCoolerProductsAll(name);
		model.addAttribute("coolerDetail",coolerDetail);
		return "Product/Product_COOLER_Detail";
	}
	//GPU 상세페이지
	@GetMapping("/Product_GPU_Detail")
	public String getGpuDetail(@RequestParam("GPU_NAME") String name, Model model) {
		GpuDTO gpuDetail=productService.getComputerGpuProductsAll(name);
		model.addAttribute("gpuDetail",gpuDetail);
		return "Product/Product_GPU_Detail";
	}
	//HDD 상세페이지
	@GetMapping("/Product_HDD_Detail")
	public String getHddDetail(@RequestParam("HDD_NAME") String name, Model model) {
		HddDTO HddDetail=productService.getComputerHddProductsAll(name);
		model.addAttribute("HddDetail",HddDetail);
		return "Product/Product_HDD_Detail";
	}
	//MainBoard 상세페이지
	@GetMapping("/Product_MB_Detail")
	public String getMbDetail(@RequestParam("MB_NAME") String name, Model model) {
		MainBoardDTO MbDetail=productService.getComputerMbProductsAll(name);
		model.addAttribute("MbDetail",MbDetail);
		return "Product/Product_MB_Detail";
	}
	//Power 상세페이지
	@GetMapping("/Product_POWER_Detail")
	public String getPowerDetail(@RequestParam("POWER_NAME") String name, Model model) {
		PowerDTO PowerDetail=productService.getComputerPowerProductsAll(name);
		model.addAttribute("PowerDetail",PowerDetail);
		return "Product/Product_POWER_Detail";
	}
	//Ram 상세페이지
	@GetMapping("/Product_RAM_Detail")
	public String getRamDetail(@RequestParam("RAM_NAME") String name, Model model) {
		RamDTO RamDetail=productService.getComputerRamProductsAll(name);
		model.addAttribute("RamDetail",RamDetail);
		return "Product/Product_RAM_Detail";
	}
	//Ssd 상세페이지
	@GetMapping("/Product_SSD_Detail")
	public String getSddDetail(@RequestParam("SSD_NAME") String name, Model model) {
		SsdDTO SsdDetail=productService.getComputerSsdProductsAll(name);
		model.addAttribute("SsdDetail",SsdDetail);
		return "Product/Product_SSD_Detail";
	}
	
}