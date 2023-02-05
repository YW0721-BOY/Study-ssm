package com.HM.service.impl;

import com.HM.dao.BookDao;
import com.HM.dao.impl.BookDaoImpl;
import com.HM.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("BookServocImpl is running……");
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destory…… ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init……");
    }
}
