package com.smartbudget.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TransactionDto {
    private long id;
    private String description;
    private Integer amount;
    // private Date date;

}
