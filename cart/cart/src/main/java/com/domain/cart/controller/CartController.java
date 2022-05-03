package com.domain.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.domain.cart.dto.ProductDto;

import com.domain.cart.entity.Order;
import com.domain.cart.service.CartService;


@RestController
@RequestMapping("/cartlist")
public class CartController {

@Autowired
private CartService cartService;



@PostMapping("/getAllCartItems")
public String getAllCartItems(@RequestParam int userId,@RequestBody List<ProductDto> productsDto)
{
return cartService.getAllreq(userId,productsDto);
}

@GetMapping("/getOrders")
public List<Order> getOrders(@RequestParam Long ordernumber)
{
return cartService.getOrders(ordernumber);
}





}
