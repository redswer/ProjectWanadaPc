package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.ProductDTO;
import com.wanada.mapper.ProductMapper;

@Service
public class ProductServicelmpl implements ProductService {

	
	@Autowired
    private ProductMapper productMapper;
	
	@Override
	public List<ProductDTO> getAllProducts() {
		// TODO Auto-generated method stub
		 return productMapper.getAllProducts();
	}

	@Override
	public List<ProductDTO> getFilteredProducts(List<String> COMPUTER_CPU, List<String> COMPUTER_COOLER, List<String> COMPUTER_GPU,
			List<String> COMPUTER_HDD, List<String> COMPUTER_Mainboard, List<String> COMPUTER_POWER, List<String> COMPUTER_RAM, List<String> COMPUTER_SSD,
			List<String> COMPUTER_CASE) {
		// TODO Auto-generated method stub
		return productMapper.getFilteredProducts(COMPUTER_CPU, COMPUTER_COOLER, COMPUTER_GPU,
				COMPUTER_HDD, COMPUTER_Mainboard, COMPUTER_POWER, COMPUTER_RAM, COMPUTER_SSD,
				COMPUTER_CASE);
	}
	@Override
	public List<CpuDTO> getComputerCpuProducts(){
		 return productMapper.getComputerCpuProducts();
	}
	
	@Override
	public List<CaseDTO> getComputerCaseProducts() {
		// TODO Auto-generated method stub
		return productMapper.getComputerCaseProducts();
	}
}
