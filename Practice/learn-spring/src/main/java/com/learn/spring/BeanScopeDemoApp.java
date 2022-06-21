package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new
                ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach newcoach=context.getBean("myCoach",Coach.class);
        Coach thecoach=context.getBean("myCoach",Coach.class);
        boolean result= (newcoach==thecoach);
        System.out.println(result);
        context.close();

    }
}
