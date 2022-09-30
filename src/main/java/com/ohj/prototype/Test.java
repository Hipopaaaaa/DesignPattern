package com.ohj.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object bean = classPathXmlApplicationContext.getBean("id01");
        System.out.println(bean);
    }
}
