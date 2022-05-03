package com.domain.cart.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.domain.cart.dto.ProductDto;
import com.domain.cart.dto.ProductResponseDto;

@FeignClient(name = "http://CATALOG-SERVICE/catalog/product")
public interface CatalogClient {

@GetMapping("/getProductById")
public ProductResponseDto getProductById(@RequestParam int productId);

}
