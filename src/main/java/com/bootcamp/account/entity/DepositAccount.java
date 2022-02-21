package com.bootcamp.account.entity;

public class DepositAccount extends BaseAccount {

    @Override
    public Double getMaintenanceFee() {
        if (super.getType() == AccountType.DEPOSIT_ACCOUNT) super.setMaintenanceFee(0D);
        return super.getMaintenanceFee();
    }

    @Override
    public Integer getMaxOperations() {
        if (super.getType() == AccountType.DEPOSIT_ACCOUNT) super.setMaxOperations(1);
        return super.getMaxOperations();
    }

}
