package com.metasoft.inventorymanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.metasoft.inventorymanager.entityclasses.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
