package com.smartbudget.mapper;

import com.smartbudget.dto.CounterpartyDto;
import com.smartbudget.entity.Counterparty;

public class CounterpartyMapper {
    public static CounterpartyDto mapToCounterpartyDto(Counterparty counterparty) {
        return new CounterpartyDto(
                counterparty.getId(),
                counterparty.getName());
    }

    public static Counterparty mapToCounterparty(CounterpartyDto counterpartyDto) {
        return new Counterparty(
                counterpartyDto.getId(),
                counterpartyDto.getName());
    }
}
