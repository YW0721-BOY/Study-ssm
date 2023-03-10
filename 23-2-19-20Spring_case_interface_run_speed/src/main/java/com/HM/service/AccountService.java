package com.HM.service;

import com.HM.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
