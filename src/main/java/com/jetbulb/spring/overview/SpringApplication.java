package com.jetbulb.spring.overview;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DistrictSystem districtSystem = context.getBean(DistrictSystem.class);
        System.out.println(districtSystem);
    }

}
