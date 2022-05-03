package com.domain.catalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.domain.catalog.entity.Product;
import com.domain.catalog.repository.ProductRepository;
import com.domain.catalog.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

@Autowired
private ProductRepository productRepository;



@Override
public List<Product> getProducts(int pageNumber,int pageSize,String productName) {
Pageable pageable=PageRequest.of(pageNumber, pageSize);
return productRepository.findAllByProductnameContaining(productName,pageable);

}



@Override
public Product getProductByid(int productId) {

return productRepository.findByProductid(productId);
}



}