package com.smartbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartbudget.entity.Counterparty;

public interface CounterpartyRepository extends JpaRepository<Counterparty, Long> {

}
