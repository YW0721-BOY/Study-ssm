package com.HM.service.impl;

import com.HM.dao.BookDao;
import com.HM.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;
    @Override
    public void save() {
        System.out.println("bookService is save");
        bookDao.save();
    }
}
