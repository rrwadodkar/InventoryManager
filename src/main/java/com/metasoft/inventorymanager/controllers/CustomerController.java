package com.metasoft.inventorymanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metasoft.inventorymanager.entityclasses.Customer;
import com.metasoft.inventorymanager.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService; 
	
	@GetMapping("/customer/customers")
	public List<Customer> getCustomers() { 
		return customerService.getCustomers();
	}
	
	@GetMapping("/customer/customer")
	public Customer getCustomerByEmail(@RequestParam String email ) {
		return customerService.findCustomerbyEmail(email);
		
	}
	@PostMapping("/customer/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) { 
		return customerService.addCustomer(customer);
	}

}
