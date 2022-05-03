package com.domain.catalog.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.domain.catalog.entity.Product;
import com.domain.catalog.service.ProductService;



@RestController
@RequestMapping("/product")
public class ProductController {

@Autowired
private ProductService productService;



@GetMapping("/getAllProducts")
public List<Product> getAllProducts(@RequestParam int pageNumber,@RequestParam int pageSize,@RequestParam String productName)
{
return productService.getProducts(pageNumber,pageSize,productName);
}

@GetMapping("/getProductById")
public Product getProductById(@RequestParam int productId)
{
return productService.getProductByid(productId);
}




}