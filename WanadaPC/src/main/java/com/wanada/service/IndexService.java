package com.wanada.service;

import java.util.List;

import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;

public interface IndexService {
	public List<IndexBannerDTO> indexBannerList();
	public List<IndexGamePcDTO> indexGamePcList();
	
}
