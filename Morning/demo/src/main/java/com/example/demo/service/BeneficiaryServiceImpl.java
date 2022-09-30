package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Beneficiary;
import com.example.demo.repository.BeneficiaryDao;

@Service
public class BeneficiaryServiceImpl implements AddBeneficiary{

	@Autowired
	private BeneficiaryDao bdao;

	@Override
	public String addBeneficiary(Beneficiary beneficiary) {
		beneficiary.setWalletId(2);;
		bdao.save(beneficiary);
		return "updated";
	}
	
	

}
