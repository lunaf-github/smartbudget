package com.smartbudget.service;

import com.smartbudget.dto.TransactionDto;

public interface TransactionService {
    TransactionDto createTransaction(TransactionDto transactionDto);
}
