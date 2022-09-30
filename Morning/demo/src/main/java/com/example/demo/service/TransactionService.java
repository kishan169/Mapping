package com.example.demo.service;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.example.demo.model.Transaction;

public interface TransactionService {
	
	public String addTransaction(Transaction transaction);
}
