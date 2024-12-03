package com.wanada.service;

import java.util.List;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.ProductDTO;

public interface ProductService {
	List<ProductDTO> getAllProducts();

	List<ProductDTO> getFilteredProducts(List<String> COMPUTER_CPU, List<String> COMPUTER_COOLER, List<String> COMPUTER_GPU,
			List<String> COMPUTER_HDD, List<String> COMPUTER_Mainboard, List<String> COMPUTER_POWER, List<String> COMPUTER_RAM, List<String> COMPUTER_SSD,
			List<String> COMPUTER_CASE);
	
	
	List<CpuDTO> getComputerCpuProducts();
	
	List<CaseDTO> getComputerCaseProducts();
	
}