package com.example.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan("com.example.DependencyInjection")

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =

                new AnnotationConfigApplicationContext(Test.class);

        HP hp = context.getBean(HP.class);

        Dell dell = context.getBean(Dell.class);

        System.out.println(hp.getType());

        System.out.println(dell.getType());

    }

}

