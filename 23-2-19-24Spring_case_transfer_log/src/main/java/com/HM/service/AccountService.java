package com.HM.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    @Transactional
    public abstract void transfer(String out,String in,Double money) throws IOException;
}
