package com.hcl.bank.service;

import java.util.List;

import javax.validation.Valid;

import com.hcl.bank.dto.CustomerDto;
import com.hcl.bank.dto.TransactionReqDto;
import com.hcl.bank.entity.Statement;

public interface BankService {
	
	public String createAccount(CustomerDto customerDto);

	public String createTransaction(@Valid TransactionReqDto transactionReqDto);

	public List<Statement> getStatement(int accountNumber, String month, int year);
	
}
