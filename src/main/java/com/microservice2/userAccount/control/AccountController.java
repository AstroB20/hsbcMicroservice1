package com.microservice2.userAccount.control;

import com.microservice2.userAccount.UserAccountApplication;
import com.microservice2.userAccount.model.UserAccount;
import com.microservice2.userAccount.service.Accountservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/useraccount")
public class AccountController {
    Accountservice accountservice;
    public AccountController(Accountservice accountservice) {
        this.accountservice = accountservice;
    }
    @GetMapping("{accountId}/balance")
    public float getAccountBalance(@PathVariable("accountId") int accountId) {
        UserAccount account = accountservice.getBalance(accountId);
        return account.getBalance();
    }
    @PostMapping
    public String createAccount(@RequestBody UserAccount userAccount){
        accountservice.CreateAccount(userAccount);
        return "Made account successfully!";
    }
}
