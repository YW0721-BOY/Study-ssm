package com.HM.service.impl;

import com.HM.dao.BookDao;
import com.HM.dao.UserDao;
import com.HM.service.BookService;
public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("bookService is running ……");
        bookDao.save();
        userDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
