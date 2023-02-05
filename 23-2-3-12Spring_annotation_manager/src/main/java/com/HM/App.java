package com.HM;

import com.HM.config.SpringConfig;
import com.HM.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1  = (BookDao) cxt.getBean(BookDao.class);
        System.out.println(bookDao1);
        BookDao bookDao2 = (BookDao) cxt.getBean(BookDao.class);
        System.out.println(bookDao2);

        cxt.close();
    }
}
