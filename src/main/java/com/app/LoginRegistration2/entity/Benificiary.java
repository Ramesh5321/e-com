package com.app.LoginRegistration2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Benificiary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	@NotNull
	@Size(min=5,message="Name is required")
	private String name;
	@NotNull
	@Size(min=5,message="Bank name is required")
	@Column(name="bank_name")
	private String bankName;
	@Column(name="ifsc_code")
	private String ifscCode;
	@ManyToOne
	@JoinColumn(name="accountIdfk")
	private Account acc;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Benificiary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
	
	


