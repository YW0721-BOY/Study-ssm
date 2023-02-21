package com.HM.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.HM")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
