package com.jetbulb.spring.overview.station.railway;

public class RailwayStation {

    private final Depot depot;

    public RailwayStation(Depot depot) {
        this.depot = depot;
    }

    @Override
    public String toString() {
        return "RailwayStation{" +
                "depot=" + depot +
                '}';
    }
}
