package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.TransactionDto;
import com.smartbudget.entity.Category;
import com.smartbudget.entity.Counterparty;
import com.smartbudget.entity.Subcategory;
import com.smartbudget.entity.Transaction;
import com.smartbudget.entity.User;
import com.smartbudget.mapper.TransactionMapper;
import com.smartbudget.repository.CategoryRepository;
import com.smartbudget.repository.CounterpartyRepository;
import com.smartbudget.repository.SubcategoryRepository;
import com.smartbudget.repository.TransactionRepository;
import com.smartbudget.repository.UserRepository;
import com.smartbudget.service.TransactionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;
    private UserRepository userRepository;
    private CategoryRepository categoryRepository;
    private CounterpartyRepository counterpartyRepository;
    private SubcategoryRepository subcategoryRepository;

    @Override
    public TransactionDto createTransaction(TransactionDto transactionDto) {
        User user = userRepository.findById(transactionDto.getUser_id()).orElse(null);
        Category category = categoryRepository.findById(transactionDto.getCategory_id()).orElse(null);
        Counterparty counterparty = counterpartyRepository.findById(transactionDto.getCounterparty_id()).orElse(null);
        Subcategory subcategory = subcategoryRepository.findById(transactionDto.getSubcategory_id()).orElse(null);

        Transaction transaction = TransactionMapper.mapToTransaction(
                transactionDto,
                user,
                category,
                counterparty,
                subcategory);

        Transaction savedTransaction = transactionRepository.save(transaction);

        return TransactionMapper.mapToTransactionDto(savedTransaction);
    }

}
