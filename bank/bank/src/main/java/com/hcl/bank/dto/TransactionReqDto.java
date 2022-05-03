package com.hcl.bank.dto;

public class TransactionReqDto {
	private int fromAccountNumber;
	private int toAccountNumber;
    private int amount;
    private String comments;
	public int getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(int fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public int getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(int toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    
}
