package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BillPayment;
import com.example.demo.model.BillPaymentDTO;
import com.example.demo.repository.BillPaymentDao;

@Service
public class BillPaymentServiceImpl implements BillPaymentService{

	@Autowired
	private BillPaymentDao bpdao;

	@Override
	public String addBillPayment(BillPayment billPayment) {

		billPayment.setWalletId(2);
		System.out.println("kishan");
		bpdao.save(billPayment);
		return "added....";
	}

	
	
	

}
