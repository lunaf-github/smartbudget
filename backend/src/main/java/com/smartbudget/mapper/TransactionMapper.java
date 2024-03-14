package com.smartbudget.mapper;

import com.smartbudget.dto.TransactionDto;
import com.smartbudget.entity.Transaction;

public class TransactionMapper {
    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getId(),
                transaction.getDescription(),
                transaction.getAmount());
        // transaction.getDate());
    }

    public static Transaction mapToTransaction(TransactionDto transactionDto) {
        return new Transaction(
                transactionDto.getId(),
                transactionDto.getDescription(),
                transactionDto.getAmount());
        // transactionDto.getDate());
    }
}
