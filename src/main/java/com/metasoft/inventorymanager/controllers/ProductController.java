package com.metasoft.inventorymanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metasoft.inventorymanager.entityclasses.Product;
import com.metasoft.inventorymanager.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService; 
	
	@GetMapping("/products")
	public List<Product> getAllProducts() { 
		return productService.getAllProducts(); 
	}
	 
}