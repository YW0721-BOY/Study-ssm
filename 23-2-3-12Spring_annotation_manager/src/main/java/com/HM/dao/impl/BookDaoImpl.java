package com.HM.dao.impl;

import com.HM.dao.BookDao;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDaoImpl is running……");
    }

    @PostConstruct
    public void init() {
        System.out.println("init is running……");
    }
    @PreDestroy
    public void destory() {
        System.out.println("destory is running……");
    }

}
