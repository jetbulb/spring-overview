package com.jetbulb.spring.overview.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RobotProductionConfiguration {

    @Bean
    public RobotFactory robotFactory() {
        return new RobotFactory();
    }

    @Bean
    @Scope("prototype")
    public Robot robot(RobotFactory factory) {
        return factory.create();
    }

}
