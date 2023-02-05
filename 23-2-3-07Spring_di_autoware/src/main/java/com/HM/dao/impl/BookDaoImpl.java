package com.HM.dao.impl;

import com.HM.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    @Override
    public void save() {
        System.out.println("book is save..."+connectionNum+databaseName);
    }
}
