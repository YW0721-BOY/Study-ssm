package com.HM.factory;

import com.HM.Dao.UserDao;
import com.HM.Dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
