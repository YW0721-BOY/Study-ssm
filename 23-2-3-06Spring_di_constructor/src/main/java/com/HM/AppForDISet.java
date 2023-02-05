package com.HM;

import com.HM.dao.BookDao;
import com.HM.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationcontext.xml");
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();
    }
}
