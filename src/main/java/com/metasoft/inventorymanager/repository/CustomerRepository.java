package com.metasoft.inventorymanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.metasoft.inventorymanager.entityclasses.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	public Customer findCustomerByEmail(String email);

}
