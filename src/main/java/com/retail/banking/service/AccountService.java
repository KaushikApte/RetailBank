package com.retail.banking.service;

import java.security.Principal;

import com.retail.banking.model.CurrentAccount;
import com.retail.banking.model.SavingsAccount;

public interface AccountService {

    CurrentAccount createCurrentAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}
