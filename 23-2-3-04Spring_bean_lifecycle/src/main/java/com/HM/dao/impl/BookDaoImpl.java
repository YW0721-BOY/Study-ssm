package com.HM.dao.impl;

import com.HM.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("BookDao is running……");
    }


    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init....");
    }

    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("destory...");
    }
}
