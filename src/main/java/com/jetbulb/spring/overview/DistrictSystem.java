package com.jetbulb.spring.overview;

public class DistrictSystem {

    /**
     * Класс {@link DistrictSystem} имеет зависимости на классы:
     * {@link ElectricityStation} и {@link WaterpumpStation}
     */
    private final ElectricityStation electricityStation;
    private WaterpumpStation waterpumpStation;

    /**
     * При помощи конструктора, Spring-IoC контейнер сможет внедрить объекты-зависимости.
     */
    public DistrictSystem(ElectricityStation electricityStation) {
        System.out.println("District System created! Good job!");
        this.electricityStation = electricityStation;
    }

    /**
     * При помощи метода-сеттера, Spring-IoC контейнер сможет внедрить объекты-зависимости.
     */
    public void setWaterpumpStation(WaterpumpStation waterpumpStation) {
        this.waterpumpStation = waterpumpStation;
    }

    @Override
    public String toString() {
        return "DistrictSystem{\n" +
                "\telectricityStation=" + electricityStation +
                ", \n\twaterpumpStation=" + waterpumpStation +
                "\n}";
    }

}
