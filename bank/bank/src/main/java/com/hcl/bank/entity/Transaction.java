package com.hcl.bank.entity;


import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transactionId;
	@Column(name="fromAccountNumber")
	private int fromAccountNumber;
	@Column(name="toAccountNumber")
	private int toAccountNumber;
	@Column(name="amount")
    private int amount;
	@Column(name="comments")
    private String comments;
    private LocalDate transactionDate;
    @Column(name="transactionYear")
    private int transactionYear;
    @Column(name="transactionMonth")
    private String transactionMonth;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
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
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	
    public int getTransactionYear() {
		return transactionYear;
	}
	public void setTransactionYear(int transactionYear) {
		this.transactionYear = transactionYear;
	}
	public String getTransactionMonth() {
		return transactionMonth;
	}
	public void setTransactionMonth(String transactionMonth) {
		this.transactionMonth = transactionMonth;
	}
	
	public Transaction(int fromAccountNumber, int toAccountNumber, int amount, String comments,
			LocalDate transactionDate, int transactionYear, String transactionMonth) {
		super();
		this.fromAccountNumber = fromAccountNumber;
		this.toAccountNumber = toAccountNumber;
		this.amount = amount;
		this.comments = comments;
		this.transactionDate = transactionDate;
		this.transactionYear = transactionYear;
		this.transactionMonth = transactionMonth;
	}
	public Transaction() {
    	
    }
}
