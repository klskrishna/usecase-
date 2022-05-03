package com.domain.cart.service;



import java.util.List;




import com.domain.cart.dto.ProductDto;

import com.domain.cart.entity.Order;

public interface CartService {

public String getAllreq(int userId,List<ProductDto> productsDto);
public List<Order> getOrders(Long ordernumber);

}