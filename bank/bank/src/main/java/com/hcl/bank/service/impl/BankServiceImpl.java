package com.hcl.bank.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.dto.CustomerDto;
import com.hcl.bank.dto.TransactionReqDto;
import com.hcl.bank.entity.Account;
import com.hcl.bank.entity.Customer;
import com.hcl.bank.entity.Statement;
import com.hcl.bank.entity.Transaction;
import com.hcl.bank.repository.AccountRepository;
import com.hcl.bank.repository.CustomerRepository;
import com.hcl.bank.repository.TransactionRepository;
import com.hcl.bank.service.BankService;
@Service
public class BankServiceImpl implements BankService {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	TransactionRepository transactionRepository;
		@Autowired
		ModelMapper mapper;
		
	@Override
	public String createAccount(CustomerDto customerDto) {
		Customer customer=mapper.map(customerDto, Customer.class);
		Account account=new Account(new Random().nextInt(900000)+100000,10000,customer);
		customer.setAccount(account);
		Customer customerDetails=customerRepository.save(customer);
		
		return String.valueOf(customerDetails.getAccount().getAccountNumber());
	}

	@Override
	public String createTransaction(@Valid TransactionReqDto transactionReqDto) {
		
		Optional<Account> fromAccount = accountRepository.findByAccountNumber(transactionReqDto.getFromAccountNumber());
		Optional<Account> toAccount = accountRepository.findByAccountNumber(transactionReqDto.getToAccountNumber());
		if(fromAccount.get().getBalance()<transactionReqDto.getAmount()) {
			return "No Sufficient Fund";
		}
		int amountAfterDebit = fromAccount.get().getBalance() - transactionReqDto.getAmount();
		fromAccount.get().setBalance(amountAfterDebit);
		accountRepository.save(fromAccount.get());
		int amountAfterCredit = toAccount.get().getBalance() + transactionReqDto.getAmount();
		toAccount.get().setBalance(amountAfterCredit);
		accountRepository.save(toAccount.get());
		
		Transaction transaction=mapper.map(transactionReqDto, Transaction.class);
		LocalDate d=LocalDate.now();
        transaction.setTransactionDate(d);
        transaction.setTransactionYear(d.getYear());
        transaction.setTransactionMonth(String.valueOf(d.getMonth()));
		
		Transaction transactionResponse = transactionRepository.save(transaction);
		
		return String.valueOf(transactionResponse.getTransactionId());
	}

	@Override
	public List<Statement> getStatement(int accountNumber, String month, int year) {
			List<Statement> statementList = new ArrayList<Statement>();
			List<Transaction> transactionList = transactionRepository.getMonthlyTransaction(accountNumber, month, year);
			for (Transaction transaction : transactionList) {
			Statement statement = new Statement();
			statement.setTransactionId(transaction.getTransactionId());
			statement.setAmount(transaction.getAmount());
			if (transaction.getFromAccountNumber() == accountNumber) {
				
			statement.setTransactionType("Debited");
			statement.setAccountNumber(transaction.getToAccountNumber());
			} else {
			statement.setTransactionType("Credited");
			statement.setAccountNumber(transaction.getFromAccountNumber());
			}
	
			statementList.add(statement);
			}
		return statementList;
	}

}
