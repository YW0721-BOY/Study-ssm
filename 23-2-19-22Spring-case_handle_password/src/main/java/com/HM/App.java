package com.HM;

import com.HM.config.SpringConfig;
import com.HM.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService bean = ctx.getBean(ResourcesService.class);
        boolean root = bean.openURL("http://pan.baidu.com/hahha", "root ");
        System.out.println(root);
    }
}
