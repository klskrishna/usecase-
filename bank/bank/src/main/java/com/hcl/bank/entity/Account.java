package com.hcl.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Account") 
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="accountId")
	private int accountId;
	private int accountNumber;
	private int balance;
	@OneToOne(mappedBy = "account")
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(int accountNumber, int balance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}
	public Account() {
		
	}
}
