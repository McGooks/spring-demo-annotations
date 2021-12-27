package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve a bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        //check if same?
        boolean result = (theCoach == alphaCoach);
        //print results
        System.out.println("point to same object: " + result);
        System.out.println("Memory location for the coach: " + theCoach);
        System.out.println("Memory location for the alphaCoach: " + alphaCoach);
        //close
        context.close();
    }
}
