package com.jetbulb.spring.overview.station;

public class WaterpumpStation {

    private String name;
    private int capacity;
    private int pumpQuantity;

    public WaterpumpStation(String name, int capacity, int pumpQuantity) {
        this.name = name;
        this.capacity = capacity;
        this.pumpQuantity = pumpQuantity;
    }

    @Override
    public String toString() {
        return "WaterpumpStation{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", pumpQuantity=" + pumpQuantity +
                '}';
    }
}
