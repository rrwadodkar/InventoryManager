package com.metasoft.inventorymanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Customer;
import com.metasoft.inventorymanager.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository; 
	
	public List<Customer> getCustomers() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customers::add);
		return customers; 
		
	}
	
	public Customer findCustomerbyEmail(String email) { 
		Customer customer = customerRepository.findCustomerByEmail(email); 
		return customer;
	}
	
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	

}
