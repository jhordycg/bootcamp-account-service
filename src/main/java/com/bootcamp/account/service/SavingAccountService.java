package com.bootcamp.account.service;

import com.bootcamp.account.entity.SavingAccount;
import reactor.core.publisher.Mono;

public interface SavingAccountService {
    Mono<SavingAccount> create(SavingAccount account);
}
