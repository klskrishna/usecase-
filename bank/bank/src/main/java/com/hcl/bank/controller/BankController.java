package com.hcl.bank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bank.dto.CustomerDto;
import com.hcl.bank.dto.TransactionReqDto;
import com.hcl.bank.entity.Statement;
import com.hcl.bank.service.BankService;
@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	BankService bankService;

	@PostMapping("/customer")
	public String saveCustomer(@RequestBody @Valid CustomerDto customerDto) {
		String accountNumber = bankService.createAccount(customerDto);
		return accountNumber;
	}
	@PostMapping("/transaction")
	public String saveTransaction(@RequestBody @Valid TransactionReqDto transactionReqDto) {
		String transactionId = bankService.createTransaction(transactionReqDto);
		return transactionId;
	}
	@GetMapping("/statement")
	public List<Statement> getStatement(@RequestParam(value = "accountNumber") int accountNumber,
	@RequestParam(value = "month") String month, @RequestParam(value = "year") int year) {
	return bankService.getStatement(accountNumber, month, year);
	}
	
}
