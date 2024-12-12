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
	List<ProductDTO> getAllProducts();

	List<ProductDTO> getFilteredProducts(List<String> COMPUTER_CPU, List<String> COMPUTER_COOLER, List<String> COMPUTER_GPU,
			List<String> COMPUTER_HDD, List<String> COMPUTER_MAINBOARD, List<String> COMPUTER_POWER, List<String> COMPUTER_RAM, List<String> COMPUTER_SSD,
			List<String> COMPUTER_CASE);
	
	List<CpuDTO> getComputerCpuProducts();
	List<CaseDTO> getComputerCaseProducts();
	List<CoolerDTO> getComputerCoolerProducts();
	List<GpuDTO> getComputerGpuProducts();
	List<HddDTO> getComputerHddProducts();
	List<MainBoardDTO>getComputerMBProducts();
	List<PowerDTO>getComputerPowerProducts();
	List<RamDTO>getComputerRamProducts();
	List<SsdDTO>getComputerSsdProducts();
}