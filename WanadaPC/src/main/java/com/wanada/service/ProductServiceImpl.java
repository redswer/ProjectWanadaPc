package com.wanada.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.wanada.dto.ProductDTO;
import com.wanada.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productMapper.getAllProducts();
    }

    @Override
    public List<ProductDTO> getFilteredProducts(Map<String, Object> filters) {
        return productMapper.getFilteredProducts(filters);
    }
}
	/*
	 @Autowired
	private ProductMapper productMapper;
	
	@Override
    public List<ProductDTO> getAllProducts() {
        return productMapper.getAllProducts();
    }

    @Override
    public List<ProductDTO> getFilteredProducts(String[] cpuProducts, String[] coolerProducts, String[] gpuProducts,
                                                String[] hddProducts, String[] mainboardProducts, String[] powerProducts,
                                                String[] remProducts, String[] ssdProducts) {
        return productMapper.getFilteredProducts(cpuProducts, coolerProducts, gpuProducts, hddProducts,
                                                 mainboardProducts, powerProducts, remProducts, ssdProducts);
    }
	 */
	

