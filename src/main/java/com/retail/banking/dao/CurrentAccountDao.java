package com.retail.banking.dao;

import org.springframework.data.repository.CrudRepository;

import com.retail.banking.model.CurrentAccount;

public interface CurrentAccountDao extends CrudRepository<CurrentAccount, Long> {

	CurrentAccount findByAccountNumber(int accountNumber);
	
}