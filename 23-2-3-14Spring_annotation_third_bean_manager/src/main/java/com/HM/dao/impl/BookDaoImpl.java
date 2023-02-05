package com.HM.dao.impl;

import com.HM.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Value("${name}")
    private  String name;
    @Override
    public void save() {
        System.out.println("book dao save ……"+name);
    }
}
