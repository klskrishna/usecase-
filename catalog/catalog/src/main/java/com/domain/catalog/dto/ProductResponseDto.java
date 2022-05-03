package com.domain.catalog.dto;

public class ProductResponseDto {

private int productid;
private String productname;
private String description;
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
	return "ProductResponseDto [productid=" + productid + ", productname=" + productname + ", description="
			+ description + ", unitprice=" + unitprice + "]";
}
public ProductResponseDto(int productid, String productname, String description, int unitprice) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.description = description;
	this.unitprice = unitprice;
}
public ProductResponseDto() {
	
}



}