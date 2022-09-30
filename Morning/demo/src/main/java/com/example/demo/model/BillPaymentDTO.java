package com.example.demo.model;


public class BillPaymentDTO {
	
	private double amount;
	
	private String dateandtime;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	public BillPaymentDTO(double amount, String dateandtime) {
		super();
		this.amount = amount;
		this.dateandtime = dateandtime;
	}
	
	
}
