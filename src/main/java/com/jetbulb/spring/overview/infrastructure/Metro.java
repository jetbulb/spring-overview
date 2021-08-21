package com.jetbulb.spring.overview.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;

public class Metro {

    private MetroLane metroLane;

    @Autowired
    public void setMetroLane(MetroLane metroLane) {
        this.metroLane = metroLane;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "metroLane=" + metroLane +
                '}';
    }
}
