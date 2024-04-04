package com.smartbudget.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "counterparties")
public class Counterparty {
    // From jakarta.persistence package, define the table primary id
    // From jakarta.persistence package, configure primary keys, the current
    // strategy auto increments id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "counterparty_id")
    private Long id;

    @Column(name = "name")
    private String name;
}
