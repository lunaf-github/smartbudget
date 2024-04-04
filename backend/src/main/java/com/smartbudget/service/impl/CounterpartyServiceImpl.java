package com.smartbudget.service.impl;

import org.springframework.stereotype.Service;

import com.smartbudget.dto.CounterpartyDto;
import com.smartbudget.entity.Counterparty;
import com.smartbudget.mapper.CounterpartyMapper;
import com.smartbudget.repository.CounterpartyRepository;
import com.smartbudget.service.CounterpartyService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CounterpartyServiceImpl implements CounterpartyService {

    private CounterpartyRepository counterpartyRepository;

    @Override
    public CounterpartyDto createCounterparty(CounterpartyDto counterpartyDto) {
        Counterparty counterparty = CounterpartyMapper.mapToCounterparty(counterpartyDto);
        Counterparty savedCounterparty = counterpartyRepository.save(counterparty);

        return CounterpartyMapper.mapToCounterpartyDto(savedCounterparty);
    }

}
