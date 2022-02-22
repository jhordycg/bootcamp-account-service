package com.bootcamp.account.entity;

import jdk.jfr.Description;
import jdk.jfr.Percentage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("account")
@NoArgsConstructor
@AllArgsConstructor
public class BaseAccount {
    @Id
    private String id;
    private String customerId;
    private AccountType type;
    private Double balance;
    private LocalDate operationScheduled;
    @Percentage
    private Double maintenanceFee;
    @Description("max operations per month")
    private Integer maxOperations;
}
