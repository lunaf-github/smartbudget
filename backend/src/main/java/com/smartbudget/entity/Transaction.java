package com.smartbudget.entity;

// import java.util.Date;

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

// From Lombok package, adds getter methods
@Getter

// From Lombok package, adds setter methods
@Setter

// From Lombok package, allows us to create a no arguments constructor
@NoArgsConstructor

// From Lombok package, used to create a parameterized constructor
@AllArgsConstructor

// From jakarta.persistence package, specifies a class as a JPA Entity
@Entity

// From jakarta.persistence package, Allows us to specify the table details,
// give table name
@Table(name = "transactions")

public class Transaction {

    // From jakarta.persistence package, define the table primary id
    // From jakarta.persistence package, configure primary keys, the current
    // strategy auto increments id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;

    // Gives properties to column, in this case gives a name to column, else the
    // variable name will be used
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    // @Column(name = "transaction_date", nullable = false)
    // private Date date;

    // @ManyToOne
    // private Category category;

    // @ManyToOne
    // private Subcategory subcategory;

    // @ManyToOne

    // private Counterparty counterparty;

}