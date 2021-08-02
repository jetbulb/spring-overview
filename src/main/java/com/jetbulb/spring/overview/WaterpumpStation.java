package com.jetbulb.spring.overview;

public class WaterpumpStation {

    private static final WaterpumpStation INSTANCE = new WaterpumpStation();

    private WaterpumpStation() {
        System.out.println("Waterpump Station created via static factory method! Good job!");
    }

    public static WaterpumpStation getInstance() {
        return INSTANCE;
    }

}
