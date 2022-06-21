package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new
                ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach newcoach=context.getBean("myCoach",Coach.class);
        System.out.println(newcoach);
        context.close();

    }
}
