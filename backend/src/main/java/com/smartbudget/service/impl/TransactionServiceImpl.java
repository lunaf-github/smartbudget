package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.TransactionDto;
import com.smartbudget.entity.Transaction;
import com.smartbudget.mapper.TransactionMapper;
import com.smartbudget.repository.TransactionRepository;
import com.smartbudget.service.TransactionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;

    @Override
    public TransactionDto createTransaction(TransactionDto transactionDto) {

        Transaction transaction = TransactionMapper.mapToTransaction(transactionDto);
        Transaction savedTransaction = transactionRepository.save(transaction);

        return TransactionMapper.mapToTransactionDto(savedTransaction);
    }

}
