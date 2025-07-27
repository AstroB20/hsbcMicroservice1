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
    @Override
    public String UpdateAccountBalance(UserAccount userAccount) {
        accountRepo.save(userAccount);
        return "Updated account";
    }
    
    @Override
    public String updateBalance(int accountId, float newBalance) {
        UserAccount account = accountRepo.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account not found with ID: " + accountId));
        account.setBalance(newBalance);
        accountRepo.save(account);
        return "Balance updated successfully";
    }
}
