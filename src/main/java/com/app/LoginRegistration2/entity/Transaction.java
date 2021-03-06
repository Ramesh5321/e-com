package com.app.LoginRegistration2.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long transactionId;

    private String accountNumber;

    private BigDecimal transactionAmount;

    private Timestamp transactionDateTime;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Transaction(Long transactionId, String fromAccountNumber, BigDecimal transactionAmount,
			Timestamp transactionDateTime) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = fromAccountNumber;
		this.transactionAmount = transactionAmount;
		this.transactionDateTime = transactionDateTime;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transaction save(Transaction transaction) {
		// TODO Auto-generated method stub
		return save(transaction);
	}
    


}
