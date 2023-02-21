package com.HM.dao.impl;

import com.HM.dao.ResourcesDao;
import org.springframework.stereotype.Component;

@Component
public class ResourcesDaoImpl implements ResourcesDao {
    public boolean readResources(String url, String password) {
        return password.equals("root");
    }
}
