package com.metasoft.inventorymanager.service;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Product;
import com.metasoft.inventorymanager.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository; 
	
	public List<Product> getAllProducts() { 
		ArrayList<Product> products = new ArrayList<Product>(); 
		productRepository.findAll().forEach(products::add);
		return products; 
	}

}
