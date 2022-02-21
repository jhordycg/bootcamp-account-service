package com.bootcamp.account.entity;

public class SavingAccount extends BaseAccount {
    @Override
    public Double getMaintenanceFee() {
        if (super.getType() == AccountType.SAVING_ACCOUNT) super.setMaintenanceFee(0D);
        return super.getMaintenanceFee();
    }

    @Override
    public Integer getMaxOperations() {
        if (super.getType() == AccountType.SAVING_ACCOUNT)   super.setMaxOperations(10);
        return super.getMaxOperations();
    }
}
