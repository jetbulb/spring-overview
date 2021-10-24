package com.jetbulb.spring.overview.scope.noprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadRobotFactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.jetbulb.spring.overview.scope.noprototype");

        RobotPod robotPod1 = context.getBean(RobotPod.class);
        System.out.println(robotPod1);

        Robot robot1 = context.getBean(Robot.class);
        System.out.println(robot1);
        Robot robot2 = context.getBean(Robot.class);
        System.out.println(robot2);


        /**
         * {@link RobotPod} содержит неизмененные бины типа {@link Robot} не смотря на то,
         * что они правильно сконфигурированы для применения {@link Scope} со значением prototype.
         *
         * Иначе говоря, при попытке создания нового бина с областью видимости singleton, его
         * свойства с областью видимости prototype не будут вновь внедряться, поскольку инициализация и
         * добавление в Spring IoC-container singleton-бина происходит только один раз, а значит это не приведет
         * к повоторному внедрению свойств.
         *
         * При этом, бин типа {@link Robot} будет успешно создаваться и добавляться в Spring IoC-container
         * как prototype, если создание происходит отдельно от singleton-бина.
         *
         * Пример:
         *
         * <pre>{@code
         *
         * ...
         * Robot prototypeScopeRobot = context.getBean(Robot.class);
         *
         * }</pre>
         */
        RobotPod robotPod2 = context.getBean(RobotPod.class);
        System.out.println(robotPod2);
    }

}