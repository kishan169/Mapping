package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BillPayment;
import com.example.demo.model.BillPaymentDTO;
import com.example.demo.service.BillPaymentService;

@RestController
public class BillController {

	private BillPaymentService bpservice;
	
	
	@PostMapping("/bill")
	private String billhandler(@RequestBody BillPayment billPayment) {
		String string =  bpservice.addBillPayment(billPayment);
		return string;
	}
}
