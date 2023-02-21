package com.HM;

import com.HM.config.SpringConfig;
import com.HM.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void transferTest() throws IOException {
        accountService.transfer("Tom","Jerry",50D);
    }
}
