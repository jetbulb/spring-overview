package com.jetbulb.spring.overview.scope.noprototype;

import org.springframework.stereotype.Component;

@Component
public class RobotPod {

    private Robot robot1;
    private Robot robot2;
    private Robot robot3;
    private Robot robot4;

    public RobotPod(Robot robot1, Robot robot2, Robot robot3, Robot robot4) {
        this.robot1 = robot1;
        this.robot2 = robot2;
        this.robot3 = robot3;
        this.robot4 = robot4;
    }

    @Override
    public String toString() {
        return "RobotPod{" +
                "\n\trobot1=" + robot1 +
                ", \n\trobot2=" + robot2 +
                ", \n\trobot3=" + robot3 +
                ", \n\trobot4=" + robot4 +
                "\n}";
    }
}
