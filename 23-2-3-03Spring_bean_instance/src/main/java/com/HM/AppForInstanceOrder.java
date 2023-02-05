package com.HM;

import com.HM.Dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        /*
         * 通过静态工厂创建对象
         * OrderDao orderDao = OrderDaoFactory.getOrderDao();
         * orderDao.save();
         */
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationcontext.xml");
        OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
        orderDao.save();
    }
}
