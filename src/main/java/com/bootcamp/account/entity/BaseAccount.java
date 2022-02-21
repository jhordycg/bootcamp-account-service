package com.bootcamp.account.entity;

import com.mongodb.lang.Nullable;
import jdk.jfr.Description;
import jdk.jfr.Percentage;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped;

import java.time.LocalDate;

@Data
@Document
public class BaseAccount {
    @Id
    private String id;
    private AccountType type;
    private Double balance;
    @Nullable
    private LocalDate operationScheduled;
    @Percentage
    private Double maintenanceFee;
    @Description("max operations per month")
    private Integer maxOperations;
}
