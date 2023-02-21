package com.HM.service.impl;

import com.HM.dao.AccountDao;
import com.HM.service.AccountService;
import com.HM.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out, String in, Double money){

        try {
            accountDao.outMoney(out,money);
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out, in, money);
        }


    }
}
