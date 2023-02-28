package com.HM.dao;

import org.apache.ibatis.annotations.Insert;

public interface AccountDao {

    @Insert("insert tbl_account(out,money) values (#{out},money-#{money})")
    public abstract boolean outMoney(String out,double money);

    @Insert("insert tbl_account(in,money) values (#{in},money+#{money})")
    public abstract boolean inMoney(String in,double money);
}
