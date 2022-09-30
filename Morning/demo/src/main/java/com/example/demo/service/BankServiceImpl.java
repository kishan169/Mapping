package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bank;
import com.example.demo.repository.BankDao;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	private BankDao bdao;
	
	@Override
	public String addbankAccount(Bank bank) {
		bank.setWalletId(2);
		bdao.save(bank);
		return "added...";
	}

}
