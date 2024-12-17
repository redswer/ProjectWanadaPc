package com.wanada.service;

import java.util.List;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.ProductDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.SsdDTO;

public interface ProductService {
	//전체 상품 조회
	List<ProductDTO> getAllProducts();
	//필터 상품만 조회
	List<ProductDTO> getFilteredProducts(List<String> COMPUTER_CPU, List<String> COMPUTER_COOLER, List<String> COMPUTER_GPU,
			List<String> COMPUTER_HDD, List<String> COMPUTER_MAINBOARD, List<String> COMPUTER_POWER, List<String> COMPUTER_RAM, List<String> COMPUTER_SSD,
			List<String> COMPUTER_CASE);
	//각각 제품 페이지
	List<CpuDTO> getComputerCpuProducts();
	List<CaseDTO> getComputerCaseProducts();
	List<CoolerDTO> getComputerCoolerProducts();
	List<GpuDTO> getComputerGpuProducts();
	List<HddDTO> getComputerHddProducts();
	List<MainBoardDTO>getComputerMBProducts();
	List<PowerDTO>getComputerPowerProducts();
	List<RamDTO>getComputerRamProducts();
	List<SsdDTO>getComputerSsdProducts();
	//제품 상세 페이지
	CpuDTO getComputerCpuProductsAll(String CPU_NAME);
	CaseDTO getComputerCaseProductsAll(String CASE_NAME);
	CoolerDTO getComputerCoolerProductsAll(String COOLER_NAME);
	GpuDTO getComputerGpuProductsAll(String GPU_NAME);
	HddDTO getComputerHddProductsAll(String HDD_NAME);
	MainBoardDTO getComputerMbProductsAll(String MB_NAME);
	PowerDTO getComputerPowerProductsAll(String POWER_NAME);
	RamDTO getComputerRamProductsAll(String RAM_NAME);
	SsdDTO getComputerSsdProductsAll(String SSD_NAME);
}