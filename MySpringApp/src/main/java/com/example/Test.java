package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        Movie m1=context.getBean("Movie1",Movie.class);
        m1.setTitle("Troy");
        System.out.println(m1.getTitle());
//        Movie m=new Movie();

        Movie m2=context.getBean("Movie2",Movie.class);
        m2.setTitle("Happy Days");
        System.out.println(m2.getTitle());

        System.out.println("Name of the Chocolates");

        Chocolates c1=context.getBean("Chocolates1", Chocolates.class);
        c1.setChocolate_name("Dairy Milk");
        System.out.println(c1.getChocolate_name());


        Chocolates c2=context.getBean("Chocolates2", Chocolates.class);
        c2.setChocolate_name("KitKat");
        System.out.println(c2.getChocolate_name());

    }
}
