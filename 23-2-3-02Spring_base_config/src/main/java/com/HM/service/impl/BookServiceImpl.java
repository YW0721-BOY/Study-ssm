package com.HM.service.impl;

import com.HM.Dao.BookDao;
import com.HM.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    public void save() {
        System.out.println("BookService is running");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
