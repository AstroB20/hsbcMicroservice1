package com.microservice2.userAccount.repository;

import com.microservice2.userAccount.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface AccountRepo extends JpaRepository<UserAccount, Integer> {
}
