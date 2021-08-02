package com.jetbulb.spring.overview;

public class StationFactory {

    public StationFactory() {
        System.out.println("Station Factory created! Good job!");
    }

    public ElectricityStation createElectricityStation() {
        return new ElectricityStation();
    }

    public WaterpumpStation createWaterpumpStation() {
        return WaterpumpStation.getInstance();
    }

}
