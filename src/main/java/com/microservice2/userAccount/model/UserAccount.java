package com.microservice2.userAccount.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_accounts")
public class UserAccount {
    @Id
    private int accountId;
    private String bankName;
    private float balance;

    public UserAccount(int accountNumber, String bankName, float balance) {
        this.accountId = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public UserAccount() {
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
