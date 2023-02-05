package com.HM;

import com.HM.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ApForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationcontext.xml");
        BeanFactory bf =new XmlBeanFactory(resource);
        BookDao book = bf.getBean(BookDao.class);
        book.save();
    }
}
