package com.HM.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String passWord;

    @Bean
    public DataSource dateSource(){
        DruidDataSource dds =new DruidDataSource();
        dds.setDriverClassName(driver);
        dds.setUrl(url);
        dds.setUsername(userName);
        dds.setPassword(passWord);

        return dds;
    }


}
