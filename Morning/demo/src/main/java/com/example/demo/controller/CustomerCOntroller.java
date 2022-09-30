package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerCOntroller {
	@Autowired
	private CustomerService service;
	
	@PostMapping("/signup")
	private String createCustomer(@RequestBody Customer customer) {
		String str = service .addCustomer(customer);
		return str;
	}
}
