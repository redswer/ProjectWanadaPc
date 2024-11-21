package com.wanada.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wanada.dto.ProductDTO;
import com.wanada.service.ProductService;

@RestController

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/filtered")
    public ResponseEntity<List<ProductDTO>> getFilteredProducts(@RequestBody Map<String, Object> filters) {
        List<ProductDTO> filteredProducts = productService.getFilteredProducts(filters);
        return ResponseEntity.ok(filteredProducts);
    }
}