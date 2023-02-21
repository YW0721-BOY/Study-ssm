package com.HM.service.impl;

import com.HM.dao.AccountDao;
import com.HM.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;


    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in,money);
        accountDao.outMoney(out,money);
    }
}
