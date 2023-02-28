package com.HM;

import com.HM.config.SpringConfig;
import com.HM.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao= ctx.getBean(BookDao.class);
        bookDao.delete();
    }
}


