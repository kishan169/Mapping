package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService tService;
	
	@PostMapping("/transaction")
	public String addTransactionController(@RequestBody Transaction transaction) {
		String string = tService.addTransaction(transaction);
		
		return "updated";
	}
}
