package com.HM;

import com.HM.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("applicationcontext.xml");


        BookDao bean = (BookDao) ac.getBean("bookDao");
        bean.save();
        //ac.registerShutdownHook();//全局
        ac.close();//只能放在最后
    }
}
