package com.wanada.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wanada.dto.ProductDTO;
import com.wanada.service.ProductService;

// @Controller
@RestController
@RequestMapping("/AJAX_Product")
public class AjaxProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/all")
	public List<ProductDTO> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping("/filtered")
	public List<ProductDTO> getFilteredOrAllProducts(
			@RequestParam(required = false) List<String> COMPUTER_CPU,
			@RequestParam(required = false) List<String> COMPUTER_COOLER,
			@RequestParam(required = false) List<String> COMPUTER_GPU,
			@RequestParam(required = false) List<String> COMPUTER_HDD,
			@RequestParam(required = false) List<String> COMPUTER_MAINBOARD,
			@RequestParam(required = false) List<String> COMPUTER_POWER,
			@RequestParam(required = false) List<String> COMPUTER_RAM,
			@RequestParam(required = false) List<String> COMPUTER_SSD,
			@RequestParam(required = false) List<String> COMPUTER_CASE) {
		
		boolean isFilterEmpty = (COMPUTER_CPU == null || COMPUTER_CPU.isEmpty())
				&& (COMPUTER_COOLER == null || COMPUTER_COOLER.isEmpty())
				&& (COMPUTER_GPU == null || COMPUTER_GPU.isEmpty())
				&& (COMPUTER_HDD == null || COMPUTER_HDD.isEmpty())
				&& (COMPUTER_MAINBOARD == null || COMPUTER_MAINBOARD.isEmpty())
				&& (COMPUTER_POWER == null || COMPUTER_POWER.isEmpty())
				&& (COMPUTER_RAM == null || COMPUTER_RAM.isEmpty())
				&& (COMPUTER_SSD == null || COMPUTER_SSD.isEmpty())
				&& (COMPUTER_CASE == null || COMPUTER_CASE.isEmpty());
		if (isFilterEmpty) {
			System.out.println("비어있음");
			return productService.getAllProducts();
		} else {
			System.out.println("있음");
			return productService.getFilteredProducts(COMPUTER_CPU, COMPUTER_COOLER, COMPUTER_GPU,
					COMPUTER_HDD, COMPUTER_MAINBOARD, COMPUTER_POWER, COMPUTER_RAM, COMPUTER_SSD,
					COMPUTER_CASE);
		}
	}

}