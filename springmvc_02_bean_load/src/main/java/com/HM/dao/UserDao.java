package com.HM.dao;

import com.HM.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
@Insert("insert into tbl_user(name,age)values(#{name},#{age})")
    public void save(User user);
}
