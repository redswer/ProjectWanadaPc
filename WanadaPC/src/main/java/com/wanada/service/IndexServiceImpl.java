package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.BoardDTO;
import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;
import com.wanada.dto.ProductDTO;
import com.wanada.dto.RecommandPcDTO;
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
	public List<BoardDTO> indexBoardList() {
		List<BoardDTO> list = mapper.indexBoardList();
		
		return list;
	}
	
	@Override
	public List<BoardDTO> searchBoard(String text) {
		List<BoardDTO> list = mapper.searchBoard(text);
		
		return list;
	}
	
	@Override
	public List<ProductDTO> searchProduct(String text) {
		
		return null;
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
}
