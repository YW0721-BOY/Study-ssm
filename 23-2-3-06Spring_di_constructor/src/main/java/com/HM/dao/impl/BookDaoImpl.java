package com.HM.dao.impl;

import com.HM.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public BookDaoImpl(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book is save..."+connectionNum+databaseName);
    }
}
