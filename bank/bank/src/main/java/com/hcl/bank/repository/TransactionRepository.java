package com.hcl.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.bank.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	@Query(nativeQuery=true,value="select * from transaction where (from_account_number=?1 or to_account_number=?1) and transaction_month=?2 and transaction_year=?3")
	List<Transaction> getMonthlyTransaction(int accountNumber, String month, int year);

}
