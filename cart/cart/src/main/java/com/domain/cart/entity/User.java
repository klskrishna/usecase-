package com.domain.cart.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")

public class User {

@Id
@Column(name = "userid")
private int userid;
@Column(name = "firstname")
private String firstname;
@Column(name = "lastname")
private String lastname;
@Column(name = "age")
private int age;
@Column(name = "email")
private String email;
@Column(name = "username")
private String username;
@Column(name = "password")
private String password;
@Column(name = "accountnumber")
private int accountnumber;
@Column(name = "balance")
private Double balance;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
			+ ", email=" + email + ", username=" + username + ", password=" + password + ", accountnumber="
			+ accountnumber + ", balance=" + balance + "]";
}
public User(int userid, String firstname, String lastname, int age, String email, String username, String password,
		int accountnumber, Double balance) {
	super();
	this.userid = userid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.email = email;
	this.username = username;
	this.password = password;
	this.accountnumber = accountnumber;
	this.balance = balance;
}
public User() {
	
}



}