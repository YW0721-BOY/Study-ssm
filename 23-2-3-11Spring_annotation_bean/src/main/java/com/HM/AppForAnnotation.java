package com.HM;

import com.HM.config.SpringConfig;
import com.HM.dao.BookDao;
import com.HM.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = (BookService) ctx.getBean("bookService");
        System.out.println(bookService);
    }
}
