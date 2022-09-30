package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bservice;
	
	@PostMapping("/bank")
	public String addbankDetails(@RequestBody Bank bank) {
		String str = bservice.addbankAccount(bank);
		return str;
	}
}
