package com.microservice2.userAccount.service;

import com.microservice2.userAccount.model.UserAccount;

public interface Accountservice {
    public UserAccount getBalance(int accountNumber);
    public String CreateAccount(UserAccount userAccount);
    public String updateBalance(int accountId, float newBalance);
    public String UpdateAccountBalance(UserAccount userAccount);
}
