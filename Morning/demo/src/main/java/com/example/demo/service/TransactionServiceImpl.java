package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactioDao;
import com.example.demo.repository.WalletDao;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private WalletDao wdao;
	
	@Autowired
	private TransactioDao tDao;
	
	
	@Override
	public String addTransaction(Transaction transaction) {
		transaction.setWalletId(2);
		tDao.save(transaction);
		return "updated";
	}

}
