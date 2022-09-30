package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private Integer accountNumber;

	
	private String mobileNumber;
	
	
	private String ifscCode;
	
	
	private String bankName;
	
	
	private double bankBalance;
	
	private Integer walletId;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	public Integer getWalletId() {
		return walletId;
	}

	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(Integer accountNumber, String mobileNumber, String ifscCode, String bankName, double bankBalance,
			Integer walletId) {
		super();
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankBalance = bankBalance;
		this.walletId = walletId;
	}
	
	
}
