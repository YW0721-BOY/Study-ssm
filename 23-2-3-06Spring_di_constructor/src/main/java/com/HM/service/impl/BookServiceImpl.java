package com.HM.service.impl;

import com.HM.dao.BookDao;
import com.HM.dao.UserDao;
import com.HM.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("bookService is running ……");
        bookDao.save();
        userDao.save();
    }
}
