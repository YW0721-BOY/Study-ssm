package com.HM;

import com.HM.config.SpringConfig;
import com.HM.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ect = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) ect.getBean("bookService");
        bookService. save();
    }
}
