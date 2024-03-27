package com.smartbudget.mapper;

import com.smartbudget.dto.TransactionDto;
import com.smartbudget.entity.Transaction;
import com.smartbudget.entity.User;

public class TransactionMapper {

    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getId(),
                transaction.getDescription(),
                transaction.getAmount(),
                transaction.getUser().getId());
    }

    public static Transaction mapToTransaction(TransactionDto transactionDto, User user) {

        return new Transaction(
                transactionDto.getId(),
                transactionDto.getDescription(),
                transactionDto.getAmount(),
                user);
    }
}
