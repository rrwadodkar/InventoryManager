package com.metasoft.inventorymanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metasoft.inventorymanager.entityclasses.Category;
import com.metasoft.inventorymanager.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService; 
	
	@GetMapping("/categories")
	public List<Category> getAllCategories() { 
		return categoryService.getCategories(); 
	}
	
	@PostMapping("/addCategory")
	public Category addCategory(@RequestBody Category category) { 
		return categoryService.addCategory(category);
	}

}
