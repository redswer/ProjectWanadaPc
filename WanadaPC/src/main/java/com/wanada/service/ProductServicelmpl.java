package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.ProductDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.SsdDTO;
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
			List<String> COMPUTER_HDD, List<String> COMPUTER_MAINBOARD, List<String> COMPUTER_POWER, List<String> COMPUTER_RAM, List<String> COMPUTER_SSD,
			List<String> COMPUTER_CASE) {
		// TODO Auto-generated method stub
		return productMapper.getFilteredProducts(COMPUTER_CPU, COMPUTER_COOLER, COMPUTER_GPU,
				COMPUTER_HDD, COMPUTER_MAINBOARD, COMPUTER_POWER, COMPUTER_RAM, COMPUTER_SSD,
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
	
	@Override
	public List<CoolerDTO> getComputerCoolerProducts() {
		// TODO Auto-generated method stub
		return productMapper.getComputerCoolerProducts();
	}
	
	@Override
	public List<GpuDTO> getComputerGpuProducts() {
		// TODO Auto-generated method stub
		return productMapper.getComputerGpuProducts();
	}
	
	@Override
	public List<HddDTO> getComputerHddProducts(){
		return productMapper.getComputerHddProducts();
	}
	
	@Override
	public List<MainBoardDTO> getComputerMBProducts(){
		return productMapper.getComputerMBProducts();
	}
	
	@Override
	public List<PowerDTO> getComputerPowerProducts(){
		return productMapper.getComputerPowerProducts();
	} 
	
	@Override
	public List<RamDTO> getComputerRamProducts(){
		return productMapper.getComputerRamProducts();
	} 
	
	@Override
	public List<SsdDTO> getComputerSsdProducts(){
		return productMapper.getComputerSsdProducts();
	} 
	
	
	@Override
	public CpuDTO getComputerCpuProductsAll(String CPU_NAME){
		return productMapper.getComputerCpuProductsAll(CPU_NAME);
	} 
}

