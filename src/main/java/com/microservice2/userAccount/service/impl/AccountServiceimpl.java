package com.microservice2.userAccount.service.impl;

import com.microservice2.userAccount.model.UserAccount;
import com.microservice2.userAccount.repository.AccountRepo;
import com.microservice2.userAccount.service.Accountservice;
import org.springframework.stereotype.Service;
@Service
public class AccountServiceimpl implements Accountservice {
    AccountRepo accountRepo;

    public AccountServiceimpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }
    @Override
    public UserAccount getBalance(int accountNumber) {
         return accountRepo.findById(accountNumber).get();
    }

    @Override
    public String CreateAccount(UserAccount userAccount) {
        accountRepo.save(userAccount);
        return "Saved Account Details!!!";
    }
}
