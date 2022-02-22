package com.bootcamp.account.service.impl;

import com.bootcamp.account.entity.BaseAccount;
import com.bootcamp.account.entity.CurrentAccount;
import com.bootcamp.account.entity.DepositAccount;
import com.bootcamp.account.entity.SavingAccount;
import com.bootcamp.account.repository.AccountRepository;
import com.bootcamp.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    final AccountRepository repository;

    @Override
    public Mono<BaseAccount> opening(BaseAccount account) {
        log.info("Create: {}", account);
        return repository.insert(account);
    }

    @Override
    public Flux<BaseAccount> findAll() {
        return repository.findAll();
    }
}
