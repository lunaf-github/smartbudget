package com.smartbudget.mapper;

import com.smartbudget.dto.TransactionDto;
import com.smartbudget.entity.Category;
import com.smartbudget.entity.Counterparty;
import com.smartbudget.entity.Subcategory;
import com.smartbudget.entity.Transaction;
import com.smartbudget.entity.User;

public class TransactionMapper {

    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getId(),
                transaction.getDescription(),
                transaction.getAmount(),
                transaction.getUser().getId(),
                transaction.getCategory().getId(),
                transaction.getCounterparty().getId(),
                transaction.getSubcategory().getId());
    }

    public static Transaction mapToTransaction(TransactionDto transactionDto, User user, Category category,
            Counterparty counterparty, Subcategory subcategory) {

        return new Transaction(
                transactionDto.getId(),
                transactionDto.getDescription(),
                transactionDto.getAmount(),
                user,
                category,
                counterparty,
                subcategory);
    }
}
