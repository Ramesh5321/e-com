package com.app.LoginRegistration2.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Account {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long accountId;
	@Column
	@NotNull
	@Size(min=6,message="account number required")
	private String accountNumber ;
	@Column
	private BigDecimal currentBalance;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accountId, String accountNumber, BigDecimal currentBalance) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}
	public Object getDeviceId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	}
	
	





