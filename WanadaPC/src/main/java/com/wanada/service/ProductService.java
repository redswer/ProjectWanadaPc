package com.wanada.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.wanada.dto.ProductDTO;

@Service
public interface ProductService {
    List<ProductDTO> getAllProducts();
    List<ProductDTO> getFilteredProducts(Map<String, Object> filters);
}