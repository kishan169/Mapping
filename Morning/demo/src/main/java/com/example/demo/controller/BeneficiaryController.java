package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Beneficiary;
import com.example.demo.service.AddBeneficiary;

@RestController
public class BeneficiaryController {

	@Autowired
	private AddBeneficiary bservice;
	
	@PostMapping("beneficiary")
	private String addBneficiaryHandler(@RequestBody Beneficiary beneficiary) {
		String string = bservice.addBeneficiary(beneficiary);
		return string;
	}
}
