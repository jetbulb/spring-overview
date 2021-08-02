package com.jetbulb.spring.overview;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ElectricityStation electricityStation = context.getBean(ElectricityStation.class);
        System.out.println(electricityStation);

        System.out.println("=============");

        WaterpumpStation waterpumpStation = context.getBean(WaterpumpStation.class);
        System.out.println(waterpumpStation);
    }

}
