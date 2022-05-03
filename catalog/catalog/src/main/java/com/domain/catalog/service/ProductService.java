package com.domain.catalog.service;



import java.util.List;



import com.domain.catalog.entity.Product;



public interface ProductService {

public List<Product> getProducts(int pageNumber,int pageSize,String productName);
public Product getProductByid(int productId);



}