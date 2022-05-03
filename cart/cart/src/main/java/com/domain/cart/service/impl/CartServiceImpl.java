package com.domain.cart.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.cart.dto.ProductDto;

import com.domain.cart.dto.TransactionReqDto;
import com.domain.cart.entity.Order;

import com.domain.cart.entity.User;
import com.domain.cart.feignclient.BankClient;
import com.domain.cart.feignclient.CatalogClient;
import com.domain.cart.repository.OrderRepository;

import com.domain.cart.repository.UserRepository;
import com.domain.cart.service.CartService;
import com.netflix.discovery.converters.Auto;

@Service
public class CartServiceImpl implements CartService {

	private static int ecommerceAccountNumber = 289063;

	@Autowired
	public CatalogClient catalogClient;
	@Autowired
	public BankClient bankClient;

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public OrderRepository orderRepository;

	@Override
	@Transactional
	public String getAllreq(int userId, List<ProductDto> productsDto) {

		int amount = productsDto.stream()
				.mapToInt(p2 -> catalogClient.getProductById(p2.getProductId()).getUnitprice() * p2.getQuantity())
				.sum();

		User user = userRepository.findByUserid(userId);

		int fromAccountNumber = user.getAccountnumber();
		int toAccountNumber = ecommerceAccountNumber;
		int finalamount = amount;
		String comments = "shopping";
		TransactionReqDto trd = new TransactionReqDto();
		trd.setFromAccountNumber(fromAccountNumber);
		trd.setToAccountNumber(toAccountNumber);
		trd.setAmount(finalamount);
		trd.setComments(comments);
		String tid = bankClient.saveTransaction(trd);
		long td = Long.parseLong(tid);

		Random rnd = new Random();

		Long tid1 = (long) rnd.nextInt(99999999);
		Long tid2 = (long) rnd.nextInt(999);
		Double remainingamount = user.getBalance() - finalamount;
		user.setBalance(remainingamount);
		userRepository.save(user);

		/*
		 * List<Order> orderList=productsDto.stream().map(req->new
		 * Order(catalogClient.getProductById(req.getProductId()).getDescription(),req.
		 * getProductId(),
		 * catalogClient.getProductById(req.getProductId()).getProductname(),req.
		 * getQuantity(),
		 * td,catalogClient.getProductById(req.getProductId()).getUnitprice(),userId,
		 * user.getUsername(), tid1,tid2)).collect(Collectors.toList());
		 */
		List<Order> orderList = new ArrayList<>();
		for (ProductDto pd : productsDto) {
			Order o = new Order(tid2,tid1,userId, user.getUsername(),pd.getProductId(),
					catalogClient.getProductById(pd.getProductId()).getProductname(),
					catalogClient.getProductById(pd.getProductId()).getDescription(),
					catalogClient.getProductById(pd.getProductId()).getUnitprice(),
					 pd.getQuantity(), td
					);
			System.out.println(o);
			// orderRepository.save(o);
			orderList.add(o);
		}
		System.out.println(orderList.size());
		orderRepository.saveAll(orderList);
		return "success";
	}

	@Override
	public List<Order> getOrders(Long ordernumber) {
// TODO Auto-generated method stub
		return orderRepository.findByOrdernumber(ordernumber);

	}

}
