package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Wallet;


@Repository
public interface WalletDao extends JpaRepository<Wallet, Integer>{

}
