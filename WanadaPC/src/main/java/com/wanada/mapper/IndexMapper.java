package com.wanada.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wanada.dto.IndexBannerDTO;
import com.wanada.dto.IndexGamePcDTO;

@Mapper
public interface IndexMapper {
	public List<IndexBannerDTO> indexBannerList();
	public List<IndexGamePcDTO> indexGamePcList();
}
