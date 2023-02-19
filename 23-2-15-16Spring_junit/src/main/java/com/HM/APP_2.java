package com.HM;

import com.HM.config.SpringConfig;
import com.HM.domain.Account;
import com.HM.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP_2 {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService =ctx.getBean(AccountService.class);

        Account byId = accountService.findById(2);
        System.out.println(byId);
    }
}
