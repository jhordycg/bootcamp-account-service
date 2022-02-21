package com.bootcamp.account.repository;

import com.bootcamp.account.entity.SavingAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SavingAccountRepository extends ReactiveMongoRepository<SavingAccount, String> {
}
