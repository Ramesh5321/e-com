package com.app.LoginRegistration2.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.LoginRegistration2.entity.Transaction;

public interface TransactionDao extends JpaRepository<Transaction,Long>{

	List<Transaction> findByAccountNumberEquals(String accountNumber);

	Transaction save(Transaction transaction);

}
