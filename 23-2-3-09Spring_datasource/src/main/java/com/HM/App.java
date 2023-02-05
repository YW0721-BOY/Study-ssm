package com.HM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationcontext.xml");
        DataSource dataSource =(DataSource) ac.getBean("dataSource");
        System.out.println(dataSource);
    }
}
