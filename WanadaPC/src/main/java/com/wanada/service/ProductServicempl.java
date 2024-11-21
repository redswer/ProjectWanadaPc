package com.wanada.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.wanada.dto.ProductDTO;
import com.wanada.mapper.ProductMapper;

@Service
public class ProductServicempl implements ProductService {

    private final ProductMapper productMapper;

    // 생성자 주입
    public ProductServicempl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productMapper.getAllProducts(); // Mapper와 연동하여 전체 제품 조회
    }

    @Override
    public List<ProductDTO> getFilteredProducts(Map<String, Object> filters) {
        return productMapper.getFilteredProducts(filters); // Mapper와 연동하여 필터링된 제품 조회
    }
}
