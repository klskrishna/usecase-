package com.domain.cart.dto;


public class ProductDto {

private int productId;
private int quantity;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "ProductDto [productId=" + productId + ", quantity=" + quantity + "]";
}
public ProductDto(int productId, int quantity) {
	super();
	this.productId = productId;
	this.quantity = quantity;
}
public ProductDto() {
	
}



}
