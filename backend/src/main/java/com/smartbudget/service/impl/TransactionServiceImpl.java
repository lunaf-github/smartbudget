package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.TransactionDto;
import com.smartbudget.entity.Transaction;
import com.smartbudget.entity.User;
import com.smartbudget.mapper.TransactionMapper;
import com.smartbudget.repository.TransactionRepository;
import com.smartbudget.repository.UserRepository;
import com.smartbudget.service.TransactionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;
    private UserRepository userRepository;

    @Override
    public TransactionDto createTransaction(TransactionDto transactionDto) {
        User user = userRepository.findById(transactionDto.getUser_id()).orElse(null);

        Transaction transaction = TransactionMapper.mapToTransaction(transactionDto, user);
        Transaction savedTransaction = transactionRepository.save(transaction);

        return TransactionMapper.mapToTransactionDto(savedTransaction);
    }

}
