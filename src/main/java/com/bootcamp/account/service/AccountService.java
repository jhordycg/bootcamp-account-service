package com.bootcamp.account.service;

import com.bootcamp.account.entity.BaseAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Mono<BaseAccount> opening(BaseAccount account);

    Flux<BaseAccount> findAll();
}
