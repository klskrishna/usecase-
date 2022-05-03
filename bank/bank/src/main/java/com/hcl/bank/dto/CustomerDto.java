package com.hcl.bank.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.hcl.bank.entity.Account;



public class CustomerDto {
    @NotEmpty(message="name can not be empty")
	private String name;
    @Min(18)
	private int age;
	@NotNull
   private Long phoneNumber;
	@Email
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private Account account;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public CustomerDto(@NotEmpty(message = "name can not be empty") String name, @Min(18) int age,
			@NotNull Long phoneNumber, @Email String email,Account account) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.account=account;
	}
	public CustomerDto() {
		
	}
}
