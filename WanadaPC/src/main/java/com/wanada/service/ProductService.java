package com.wanada.service;

import java.util.List;
import java.util.Map;

import com.wanada.dto.ProductDTO;

public interface ProductService {
	List<ProductDTO> getAllProducts();

	List<ProductDTO> getFilteredProducts(Map<String, Object> filters);
}
