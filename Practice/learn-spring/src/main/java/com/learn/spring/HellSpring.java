package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloSpring {

    public static void main(String[] args) {
        System.out.println("Spring");
        //Loading the spring container
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrive bean from container
       // Coach mycoach= context.getBean("myCoach",Coach.class);
       // Coach cricket= context.getBean("cricket",Coach.class);
        //calling method of bean
        //String result=mycoach.getDailyWorkout();
        //System.out.println(cricket.getDailyWorkout());
        //System.out.println( mycoach.getDailyWorkout());
       // System.out.println(result);
        //close context
//        Coach myNewCoach= context.getBean("myCoach",Coach.class);
//        System.out.println(myNewCoach.getDailyFortune());
        Coach myCricCoach= context.getBean("cricket2",Coach.class);
        System.out.println(myCricCoach.getDailyFortune());
//        Setterdemo setterdemo= context.getBean("cricket",Setterdemo.class);
//        System.out.println(setterdemo.getEmailAddress());
//        System.out.println(setterdemo.getTeam());
        context.close();
    }
}