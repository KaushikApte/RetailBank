package com.retail.banking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.retail.banking.model.CurrentTransaction;

public interface CurrentTransactionDao extends CrudRepository<CurrentTransaction, Long> {

    List<CurrentTransaction> findAll();
    
}