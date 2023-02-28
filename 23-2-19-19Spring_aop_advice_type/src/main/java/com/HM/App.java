package com.HM;

import com.HM.config.SpringConfig;
import com.HM.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext act=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = act.getBean(BookDao.class);
        int select = bean.select();
        System.out.println(select);
    }
}
