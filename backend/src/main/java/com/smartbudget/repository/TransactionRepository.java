package com.smartbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartbudget.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Here, we can define custom crud functions, for example;
    // Optional<Transaction> findByCategory(String category);

}
