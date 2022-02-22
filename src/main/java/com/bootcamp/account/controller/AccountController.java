package com.bootcamp.account.controller;

import com.bootcamp.account.dto.AccountDto;
import com.bootcamp.account.dto.DepositAccountDto;
import com.bootcamp.account.entity.*;
import com.bootcamp.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService service;
    private final ModelMapper mapper;

    @GetMapping
    public Flux<BaseAccount> findAll() {
        return service.findAll();
    }

    @PostMapping("current")
    public Mono<BaseAccount> openingCurrent(@RequestBody AccountDto account) {
        var accountMapped = mapper.map(account, CurrentAccount.class);
        accountMapped.setType(AccountType.CURRENT_ACCOUNT);
        return service.opening(accountMapped);
    }

    @PostMapping("saving")
    public Mono<BaseAccount> openingSaving(@RequestBody AccountDto account) {
        var accountMapped = mapper.map(account, SavingAccount.class);
        accountMapped.setType(AccountType.SAVING_ACCOUNT);
        return service.opening(accountMapped);
    }

    @PostMapping("deposit")
    public Mono<BaseAccount> openingDeposit(@RequestBody DepositAccountDto account) {
        var accountMapped = mapper.map(account, DepositAccount.class);
        accountMapped.setType(AccountType.DEPOSIT_ACCOUNT);
        return service.opening(accountMapped);
    }
}
