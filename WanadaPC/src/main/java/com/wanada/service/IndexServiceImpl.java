package com.wanada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanada.dto.IndexBannerDTO;
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
}
