package com.HM.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.HM")
@PropertySource("jdbc.properties")
public class SpringConfig {

    //1. 定义一个方法获得要管理的对象
    //2. 添加@Bean,表示当前方法的返回值是一个bean
    @Bean("dataSource")
    public DataSource dataSource(){
        DruidDataSource ds =new DruidDataSource();
        ds.setDriverClassName("jdbc:mysql://localhost:3306/spring_db");
        ds.setUsername("root");
        ds.setPassword("SLJB0721.com");
        return ds;
    }
}
