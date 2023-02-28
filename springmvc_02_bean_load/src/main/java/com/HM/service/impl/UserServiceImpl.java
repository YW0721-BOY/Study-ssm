package com.HM.service.impl;

import com.HM.domain.User;
import com.HM.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user){
        System.out.println("user service ……");
    }
}
