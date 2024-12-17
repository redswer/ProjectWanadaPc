package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.BoardDTO;
import com.wanada.dto.CaseDTO;
import com.wanada.dto.CoolerDTO;
import com.wanada.dto.CpuDTO;
import com.wanada.dto.GpuDTO;
import com.wanada.dto.HddDTO;
import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;
import com.wanada.dto.MainBoardDTO;
import com.wanada.dto.PcDTO;
import com.wanada.dto.PowerDTO;
import com.wanada.dto.RamDTO;
import com.wanada.dto.RecommandPcDTO;
import com.wanada.dto.SsdDTO;
import com.wanada.mapper.IndexMapper;

@Service
public class IndexServiceImpl implements IndexService {
	@Autowired
	private IndexMapper mapper;
	
	@Override
	public List<IndexBannerDTO> indexBannerList() {
		List<IndexBannerDTO> list = mapper.indexBannerList();
		
		return list;
	}
	
	@Override
	public List<IndexGamePcDTO> indexGamePcList() {
		List<IndexGamePcDTO> list = mapper.indexGamePcList();
		
		return list;
	}
	
	@Override
	public List<RecommandPcDTO> recommandPcGameList() {
		List<RecommandPcDTO> list = mapper.recommandPcGameList();
		
		return list;
	}
	
	@Override
	public List<RecommandPcDTO> recommandPcPartsList() {
		List<RecommandPcDTO> list = mapper.recommandPcPartsList();
		
		return list;
	}
	
	@Override
	public List<PcDTO> indexPcList(String category) {
		List<PcDTO> list = mapper.indexPcList(category);
		
		return list;
	}
	
	@Override
	public PcDTO pcDetail(int product_id) {
		PcDTO dto = mapper.pcDetail(product_id);
		
		return dto;
	}
	
	@Override
	public CpuDTO cpu(int product_id) {
		CpuDTO dto = mapper.cpu(product_id);
		
		return dto;
	}
	
	@Override
	public CoolerDTO cooler(int product_id) {
		CoolerDTO dto = mapper.cooler(product_id);
		
		return dto;
	}
	
	@Override
	public MainBoardDTO mainboard(int product_id) {
		MainBoardDTO dto = mapper.mainboard(product_id);
		
		return dto;
	}
	
	@Override
	public RamDTO ram(int product_id) {
		RamDTO dto = mapper.ram(product_id);
		
		return dto;
	}
	
	@Override
	public GpuDTO gpu(int product_id) {
		GpuDTO dto = mapper.gpu(product_id);
		
		return dto;
	}
	
	@Override
	public SsdDTO ssd(int product_id) {
		SsdDTO dto = mapper.ssd(product_id);
		
		return dto;
	}
	
	@Override
	public PowerDTO power(int product_id) {
		PowerDTO dto = mapper.power(product_id);
		
		return dto;
	}
	
	@Override
	public CaseDTO pc_case(int product_id) {
		CaseDTO dto = mapper.pc_case(product_id);
		
		return dto;
	}
	
	@Override
	public List<BoardDTO> indexBoardList() {
		List<BoardDTO> list = mapper.indexBoardList();
		
		return list;
	}
	
	@Override
	public IndexBannerDTO etcPC(String category) {
		IndexBannerDTO dto = mapper.etcPC(category);
		
		return dto;
	}
	
	@Override
	public IndexGamePcDTO gamePC(String category) {
		IndexGamePcDTO dto = mapper.gamePC(category);
		
		return dto;
	}
	
	@Override
	public List<BoardDTO> searchBoard(String text) {
		List<BoardDTO> list = mapper.searchBoard(text);
		
		return list;
	}
	
	@Override
	public List<CaseDTO> searchCase(String text) {
		List<CaseDTO> list = mapper.searchCase(text);
		
		return list;
	}
	
	@Override
	public List<CoolerDTO> searchCooler(String text) {
		List<CoolerDTO> list = mapper.searchCooler(text);
		
		return list;
	}
	
	@Override
	public List<CpuDTO> searchCpu(String text) {
		List<CpuDTO> list = mapper.searchCpu(text);
		
		return list;
	}
	
	@Override
	public List<GpuDTO> searchGpu(String text) {
		List<GpuDTO> list = mapper.searchGpu(text);
		
		return list;
	}
	
	@Override
	public List<HddDTO> searchHdd(String text) {
		List<HddDTO> list = mapper.searchHdd(text);
		
		return list;
	}
	
	@Override
	public List<MainBoardDTO> searchMainBoard(String text) {
		List<MainBoardDTO> list = mapper.searchMainBoard(text);
		
		return list;
	}
	
	@Override
	public List<PowerDTO> searchPower(String text) {
		List<PowerDTO> list = mapper.searchPower(text);
		
		return list;
	}
	
	@Override
	public List<RamDTO> searchRam(String text) {
		List<RamDTO> list = mapper.searchRam(text);
		
		return list;
	}
	
	@Override
	public List<SsdDTO> searchSsd(String text) {
		List<SsdDTO> list = mapper.searchSsd(text);
		
		return list;
	}
}
