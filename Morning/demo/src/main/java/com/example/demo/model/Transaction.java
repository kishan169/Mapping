package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transectionId;
	
	private double amount;
	
	private String description;
	
	private Integer walletId;

	public Integer getTransectionId() {
		return transectionId;
	}

	public void setTransectionId(Integer transectionId) {
		this.transectionId = transectionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getWalletId() {
		return walletId;
	}

	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(Integer transectionId, double amount, String description, Integer walletId) {
		super();
		this.transectionId = transectionId;
		this.amount = amount;
		this.description = description;
		this.walletId = walletId;
	}

	
	
	
}
