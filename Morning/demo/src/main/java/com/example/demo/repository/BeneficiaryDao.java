package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Beneficiary;

@Repository
public interface BeneficiaryDao extends JpaRepository<Beneficiary, Integer>{

}
