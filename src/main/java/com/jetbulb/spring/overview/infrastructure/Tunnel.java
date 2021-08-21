package com.jetbulb.spring.overview.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;

public class Tunnel {
    @Autowired(required = false)
    private TunnelLane lane;

    @Override
    public String toString() {
        return "Tunnel{" +
                "lane=" + lane +
                '}';
    }
}
