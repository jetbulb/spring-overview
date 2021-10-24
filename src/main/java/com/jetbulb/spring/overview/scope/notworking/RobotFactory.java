package com.jetbulb.spring.overview.scope.notworking;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class RobotFactory {

    Robot create() {
        return new Robot();
    }

}
