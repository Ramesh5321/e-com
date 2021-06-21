package com.app.LoginRegistration2.request;

import java.math.BigDecimal;

public class TransferBalanceRequest {
	private String fromAccountNumber;
	private String toAccountNumber;
	private BigDecimal amount;
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public TransferBalanceRequest(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {
		super();
		this.fromAccountNumber = fromAccountNumber;
		this.toAccountNumber = toAccountNumber;
		this.amount = amount;
	}
	public TransferBalanceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
