package com.wanada.service;

import java.util.List;

import com.wanada.dto.BoardDTO;
import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;
import com.wanada.dto.ProductDTO;
import com.wanada.dto.RecommandPcDTO;

public interface IndexService {
	public List<IndexBannerDTO> indexBannerList();
	public List<IndexGamePcDTO> indexGamePcList();
	public List<RecommandPcDTO> recommandPcGameList();
	public List<RecommandPcDTO> recommandPcPartsList();
	public List<BoardDTO> indexBoardList();
	public List<BoardDTO> searchBoard(String text);
	public List<ProductDTO> searchProduct(String text);
	public IndexBannerDTO etcPC(String category);
	public IndexGamePcDTO gamePC(String category);
}
