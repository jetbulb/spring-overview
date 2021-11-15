package com.jetbulb.spring.overview.beans.naming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        context.getBeansOfType(BeanA.class)
                .forEach((k, v) -> System.out.printf("Id: %s%nBean: %s%n%n", k, v));

        System.out.println("Bean with alias: aliasedTwinBean");
        System.out.println(context.getBean("aliasedTwinBean"));
    }
}
