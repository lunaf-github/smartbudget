// package com.smartbudget.entity;

// import java.util.Set;
// import java.util.HashSet;

// import jakarta.persistence.Column;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;

// public class Counterparty {

// // From jakarta.persistence package, define the table primary id
// // From jakarta.persistence package, configure primary keys, the current
// // strategy auto increments id
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long id;

// @Column(name = "name")
// private String name;

// @OneToMany(mappedBy = "transaction")
// private Set<Transaction> transactions = new HashSet<>();
// }
