package com.wanada.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wanada.dto.ProductDTO;
import com.wanada.service.ProductService;

@Controller
@RequestMapping("/ProductController")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String productMain(Model model) {
        // 기본 페이지 렌더링
        return "Product/Product_main";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<ProductDTO> getAllProductsAjax() {
        // Ajax 요청 처리
        return productService.getAllProducts();
    }
    /*
    @PostMapping("/filtered")
    @ResponseBody
    public List<ProductDTO> getFilteredProducts(
            @RequestParam(value = "CPU_Product_list[]", required = false) String[] computerCpu,
            @RequestParam(value = "COOLER_Product_list[]", required = false) String[] computerCooler,
            @RequestParam(value = "GPU_Product_list[]", required = false) String[] computerGpu,
            @RequestParam(value = "HDD_Product_list[]", required = false) String[] computerHdd,
            @RequestParam(value = "Mainboard_Product_list[]", required = false) String[] computerMainboard,
            @RequestParam(value = "POWER_Product_list[]", required = false) String[] computerPower,
            @RequestParam(value = "REM_Product_list[]", required = false) String[] computerRem,
            @RequestParam(value = "SSD_Product_list[]", required = false) String[] computerSsd) {

        boolean isFilterEmpty = (computerCpu == null || computerCpu.length == 0) &&
                                (computerCooler == null || computerCooler.length == 0) &&
                                (computerGpu == null || computerGpu.length == 0) &&
                                (computerHdd == null || computerHdd.length == 0) &&
                                (computerMainboard == null || computerMainboard.length == 0) &&
                                (computerPower == null || computerPower.length == 0) &&
                                (computerRem == null || computerRem.length == 0) &&
                                (computerSsd == null || computerSsd.length == 0);

        if (isFilterEmpty) {
            return productService.getAllProducts();
        } else {
            return productService.getFilteredProducts(computerCpu, computerCooler, computerGpu, computerHdd, computerMainboard, computerPower, computerRem, computerSsd);
        }
    }*/
    @PostMapping("/filtered")
    @ResponseBody
    public List<ProductDTO> getFilteredProducts(@RequestParam Map<String, Object> filters) {
    	// 필터가 없는 경우 전체 데이터 반환
        if (filters.isEmpty()) {
            return productService.getAllProducts();
        }

        // 필요 시 추가적인 변환 로직
        //Map<String, Object> processedFilters = processFilters(filters);

        // 필터링된 데이터 반환
        return productService.getFilteredProducts(filters);

    }
}