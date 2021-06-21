package com.app.LoginRegistration2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.LoginRegistration2.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {

	Account findByAccountNumberEquals(String accountNumber);
}
