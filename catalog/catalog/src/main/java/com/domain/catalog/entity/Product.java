package com.domain.catalog.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;







@Entity
@Table(name = "product")

public class Product {

@Id
@Column(name = "productid")
private int productid;
@Column(name="productname")
private String productname;
@Column(name="description")
private String description;
@Column(name = "unitprice")
private int unitprice;
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
@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + ", description=" + description
			+ ", unitprice=" + unitprice + "]";
}
public Product(int productid, String productname, String description, int unitprice) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.description = description;
	this.unitprice = unitprice;
}
public Product() {
	
}



}