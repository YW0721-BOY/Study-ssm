package com.HM;

import com.HM.dao.BookDao;
import com.HM.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationcontext.xml");
//        BookDao bookDao = (BookDao) ac.getBean("bookDao");
//        bookDao.save();
        BookServiceImpl bookService = (BookServiceImpl) ac.getBean("bookService");
        bookService.save();
    }
}
