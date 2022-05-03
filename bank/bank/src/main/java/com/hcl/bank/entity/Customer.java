package com.hcl.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
	@Table (name = "Customer") 
	public class Customer {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int customerId;
		
		private String name;
		
		private int age;
		
	   private Long phoneNumber;
		
		private String email;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="accountId")
		private Account account;

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

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

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}

		public Customer(String name, int age, Long phoneNumber, String email, Account account) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.account = account;
		}

		public Customer() {
			
		}
}
