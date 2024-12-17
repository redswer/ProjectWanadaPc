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
import com.wanada.dto.ProductDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.SsdDTO;
import com.wanada.mapper.ProductMapper;

@Service
public class ProductServicelmpl implements ProductService {

	
	@Autowired
    private ProductMapper productMapper;
	//전체 제품 조회
	@Override
	public List<ProductDTO> getAllProducts() {
		// TODO Auto-generated method stub
		 return productMapper.getAllProducts();
	}
	//필터링 제품조회
	@Override
	public List<ProductDTO> getFilteredProducts(List<String> COMPUTER_CPU, List<String> COMPUTER_COOLER, List<String> COMPUTER_GPU,
			List<String> COMPUTER_HDD, List<String> COMPUTER_MAINBOARD, List<String> COMPUTER_POWER, List<String> COMPUTER_RAM, List<String> COMPUTER_SSD,
			List<String> COMPUTER_CASE) {
		// TODO Auto-generated method stub
		return productMapper.getFilteredProducts(COMPUTER_CPU, COMPUTER_COOLER, COMPUTER_GPU,
				COMPUTER_HDD, COMPUTER_MAINBOARD, COMPUTER_POWER, COMPUTER_RAM, COMPUTER_SSD,
				COMPUTER_CASE);
	}
	//각 제품 페이지 조회
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
	//제품 상세 조회 페이지
	@Override
	public CpuDTO getComputerCpuProductsAll(String CPU_NAME){
		return productMapper.getComputerCpuProductsAll(CPU_NAME);
	} 
	@Override
	public CaseDTO getComputerCaseProductsAll(String CASE_NAME){
		return productMapper.getComputerCaseProductsAll(CASE_NAME);
	} 
	@Override
	public CoolerDTO getComputerCoolerProductsAll(String COOLER_NAME) {
		return productMapper.getComputerCoolerProductsAll(COOLER_NAME);
	}
	@Override 
	public GpuDTO getComputerGpuProductsAll(String GPU_NAME) {
		return productMapper.getComputerGpuProductsAll(GPU_NAME);
	}
	@Override 
	public HddDTO getComputerHddProductsAll(String HDD_NAME) {
		return productMapper.getComputerHddProductsAll(HDD_NAME);
	}
	@Override
	public MainBoardDTO getComputerMbProductsAll(String MB_NAME) {
		return productMapper.getComputerMbProductsAll(MB_NAME);
	}
	@Override
	public PowerDTO getComputerPowerProductsAll(String POWER_NAME) {
		return productMapper.getComputerPowerProductsAll(POWER_NAME);
	}
	@Override
	public RamDTO getComputerRamProductsAll(String RAM_NAME) {
		return productMapper.getComputerRamProductsAll(RAM_NAME);
	}
	@Override
	public SsdDTO getComputerSsdProductsAll(String SSD_NAME) {
		return productMapper.getComputerSsdProductsAll(SSD_NAME);
	}
	
}

