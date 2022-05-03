package com.domain.cart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	

	@Column(name = "orderid")
	private Long orderid;
	@Column(name = "ordernumber")
	private Long ordernumber;
	

	/*public Order(String description, int productid, String productname, int quantity, Long transactionid, int unitprice,
			int userid, String username, Long ordernumber, Long orderid) {
		super();
		this.ordernumber = ordernumber;
		this.userid = userid;
		this.username = username;
		this.productid = productid;
		this.productname = productname;
		this.description = description;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.transactionid = transactionid;
		this.orderid = orderid;
	}*/

	@Column(name = "userid")
	private int userid;
	@Column(name = "username")
	private String username;
	@Column(name = "productid")
	private int productid;
	@Column(name = "productname")
	private String productname;
	@Column(name = "description")
	private String description;
	@Column(name = "unitprice")
	private int unitprice;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "transactionid")
	private Long transactionid;



	/*@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordernumber=" + ordernumber + ", userid=" + userid + ", username="
				+ username + ", productid=" + productid + ", productname=" + productname + ", description="
				+ description + ", unitprice=" + unitprice + ", quantity=" + quantity + ", transactionid="
				+ transactionid + "]";
	}*/

	public Order() {

	}



	public Order(Long orderid, Long ordernumber, int userid, String username, int productid,
			String productname, String description, int unitprice, int quantity, Long transactionid) {
		super();
		
		this.orderid = orderid;
		this.ordernumber = ordernumber;
		this.userid = userid;
		this.username = username;
		this.productid = productid;
		this.productname = productname;
		this.description = description;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.transactionid = transactionid;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Long getOrderid() {
		return orderid;
	}



	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}



	public Long getOrdernumber() {
		return ordernumber;
	}



	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}



	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public int getProductid() {
		return productid;
	}



	public void setProductid(int productid) {
		this.productid = productid;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getUnitprice() {
		return unitprice;
	}



	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Long getTransactionid() {
		return transactionid;
	}



	public void setTransactionid(Long transactionid) {
		this.transactionid = transactionid;
	}



	@Override
	public String toString() {
		return "Order [description=" + description + ", id=" + id + ", orderid=" + orderid + ", ordernumber="
				+ ordernumber + ", productid=" + productid + ", productname=" + productname + ", quantity=" + quantity
				+ ", transactionid=" + transactionid + ", unitprice=" + unitprice + ", userid=" + userid + ", username="
				+ username + "]";
	}

}