package com.domain.cart.feignclient;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.domain.cart.dto.TransactionReqDto;

@FeignClient(value="bank-service",url = "http://localhost:8089/bank")
public interface BankClient {
	@PostMapping("/transaction")
	public String saveTransaction(@RequestBody TransactionReqDto transactionReqDto);
}
