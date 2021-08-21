package com.jetbulb.spring.overview.station.petrol;

import org.springframework.beans.factory.annotation.Autowired;

public class PetrolStation {

    private FuelPump pump;
    private FuelTank tank;

    public PetrolStation() {
    }

    @Autowired(required = false)
    public PetrolStation(FuelTank tank) {
        this.tank = tank;
    }

    @Autowired(required = false)
    public PetrolStation(FuelPump pump, FuelTank tank) {
        this.pump = pump;
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "PetrolStation{" +
                "pump=" + pump +
                ", tank=" + tank +
                '}';
    }
}
