package com.jetbulb.spring.overview;

public class WaterpumpStation {

    private String name;
    private int capacity;
    private int pumpQuantity;

    public WaterpumpStation(String name, int capacity, int pumpQuantity) {
        this.name = name;
        this.capacity = capacity;
        this.pumpQuantity = pumpQuantity;
    }

    public WaterpumpStation() {
        System.out.println("Waterpump Station created! Good job!");
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
