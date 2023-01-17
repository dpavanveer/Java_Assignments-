package com.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {



   @SuppressWarnings("resource")
    public static <ApplicationContext> void main(String[] args)
    {
        ApplicationContext context;
        context = new ApplicationContext("NewFile.xml");
        App hw = (App) context.getBean("hi");
        System.out.println(hw.hashCode());
        System.out.println(hw.msg);
    }
}