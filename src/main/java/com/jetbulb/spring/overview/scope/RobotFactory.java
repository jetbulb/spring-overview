package com.jetbulb.spring.overview.scope;

import org.springframework.stereotype.Component;

@Component
public class RobotFactory {

    Robot create() {
        return new Robot();
    }

}
