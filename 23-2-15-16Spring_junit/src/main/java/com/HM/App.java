package com.HM;

import com.HM.dao.AccountDao;
import com.HM.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();

        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml.BAK");

        SqlSessionFactory sqlSessionFactory =sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();

        AccountDao accountDao =sqlSession.getMapper(AccountDao.class);

        Account byId = accountDao.findById(1);
        System.out.println(byId);

        sqlSession.close();
    }
}
