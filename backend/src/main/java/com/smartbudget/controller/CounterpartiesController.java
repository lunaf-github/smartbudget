package com.smartbudget.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.smartbudget.dto.CounterpartyDto;
import com.smartbudget.service.CounterpartyService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/counterparties")
public class CounterpartiesController {

    private CounterpartyService counterpartyService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public CounterpartyDto addCounterpart(@RequestBody CounterpartyDto counterpartyDto) {
        return counterpartyService.createCounterparty(counterpartyDto);
    }

}
