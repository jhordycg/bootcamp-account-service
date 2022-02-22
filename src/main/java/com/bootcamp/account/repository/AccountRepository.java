package com.bootcamp.account.repository;

import com.bootcamp.account.entity.BaseAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<BaseAccount, String> {
}
