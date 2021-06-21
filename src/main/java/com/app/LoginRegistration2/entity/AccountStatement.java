package com.app.LoginRegistration2.entity;

import java.math.BigDecimal;
import java.util.List;



public class AccountStatement {
    BigDecimal currentBalance;
    List<com.app.LoginRegistration2.entity.Transaction> transactionHistory;
	public AccountStatement(BigDecimal currentBalance, List<com.app.LoginRegistration2.entity.Transaction> list) {
		super();
		this.currentBalance = currentBalance;
		this.transactionHistory = list;
	}
	public AccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}


}
