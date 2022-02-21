package com.bootcamp.account.entity;

public class CurrentAccount extends BaseAccount {

    @Override
    public Double getMaintenanceFee() {
        if (super.getType() == AccountType.CURRENT_ACCOUNT) super.setMaintenanceFee(1.0D);
        return super.getMaintenanceFee();
    }

    @Override
    public Integer getMaxOperations() {
        if (super.getType() == AccountType.CURRENT_ACCOUNT) super.setMaxOperations(0);
        return super.getMaxOperations();
    }
}
