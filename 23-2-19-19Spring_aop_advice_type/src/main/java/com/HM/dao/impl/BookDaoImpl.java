package com.HM.dao.impl;

import com.HM.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void update() {
        System.out.println("book is update……");
    }

    @Override
    public int select() {
        System.out.println("book is select……");
        return 100;
    }
}
