package com.jetbulb.spring.overview.beans.naming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.jetbulb.spring.overview.beans.naming");

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(name -> System.out.printf("Id: %s%n%n", name));
    }
}
