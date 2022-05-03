package com.domain.cart.dto;

public class ProductResponseDto {
private int productid;
private String productname;
private String description;
private int unitprice;
private int quantity;
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
public ProductResponseDto(int productid, String productname, String description, int unitprice, int quantity) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.description = description;
	this.unitprice = unitprice;
	this.quantity = quantity;
}
public ProductResponseDto() {
	super();
}


}
