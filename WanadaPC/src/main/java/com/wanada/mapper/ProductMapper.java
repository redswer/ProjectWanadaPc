package com.wanada.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wanada.dto.ProductDTO;

@Mapper
public interface ProductMapper {
	List<ProductDTO> getAllProducts();

	List<ProductDTO> getFilteredProducts(@Param("filters") Map<String, Object> filters);
}
