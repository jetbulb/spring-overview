package com.jetbulb.spring.overview.scope.notworking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadRobotFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BadRobotProductionConfiguration.class);
        RobotFactory robotFactory = context.getBean(RobotFactory.class);
        System.out.println(robotFactory);
        Robot robot1 = context.getBean(Robot.class);
        System.out.println(robot1);
        Robot robot2 = context.getBean(Robot.class);
        System.out.println(robot2);
    }

}
