package com.metasoft.inventorymanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Category;
import com.metasoft.inventorymanager.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository; 
	
	public List<Category> getCategories() { 
		ArrayList<Category> categories = new ArrayList<Category>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}
	public Category addCategory(Category category) { 
		return categoryRepository.save(category);
	}

}
