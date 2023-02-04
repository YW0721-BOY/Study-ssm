package com.HM.factory;

import com.HM.Dao.OrderDao;
import com.HM.Dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    //这个方法是静态的
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
