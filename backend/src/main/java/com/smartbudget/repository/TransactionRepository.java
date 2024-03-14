package com.smartbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartbudget.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
