package com.HM;

import com.HM.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();
    }
}
