package com.bootcamp.account.dto;

import jdk.jfr.Description;
import jdk.jfr.Percentage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {
    private String id;
    private String customerId;
    private Double balance;
    @Percentage
    private Double maintenanceFee;
    @Description("max operations per month")
    private Integer maxOperations;
}
