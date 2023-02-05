package com.HM;

import com.HM.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //1、加载类路径下的配置文件
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、文件系统下加载配置文件
        //ApplicationContext ctx =new FileSystemXmlApplicationContext("F:\\JavaLearningRoad\\Study-ssm\\23-2-3-10Spring_container\\src\\main\\resources\\applicationcontext.xml");
        //BookDao bookDao = (BookDao) ac.getBean("bookDao");
        BookDao bookDao = ac.getBean("bookDao", BookDao.class);

        BookDao bookDao1 =ac.getBean(BookDao.class);
        bookDao.save();
        bookDao1.save();
    }
}
