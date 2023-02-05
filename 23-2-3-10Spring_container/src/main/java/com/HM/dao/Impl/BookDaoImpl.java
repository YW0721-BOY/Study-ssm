package com.HM.dao.Impl;

import com.HM.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor");
    }

    @Override
    public void save() {
        System.out.println("bookDao is save……");
    }
}
