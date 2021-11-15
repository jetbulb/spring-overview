package com.jetbulb.spring.overview.beans.naming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        context.getBeansOfType(BBeanA.class)
                .forEach((k, v) -> System.out.printf("Id: %s%nBean: %s%n%n", k, v));

        context.getBeansOfType(BBBeanA.class)
                .forEach((k, v) -> System.out.printf("Id: %s%nBean: %s%n%n", k, v));
    }
}
