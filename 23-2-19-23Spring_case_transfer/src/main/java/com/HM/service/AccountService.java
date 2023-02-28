package com.HM.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

    @Transactional
    public abstract void transfer(String out,String in,Double money);
}
