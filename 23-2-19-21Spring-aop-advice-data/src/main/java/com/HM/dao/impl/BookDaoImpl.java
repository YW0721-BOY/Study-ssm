package com.HM.dao.impl;

import com.HM.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BookDaoImpl implements BookDao {
    public String  findName(int id) {
        System.out.println("id"+id);
        return "itcast";
    }
}
