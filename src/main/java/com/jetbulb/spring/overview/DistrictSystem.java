package com.jetbulb.spring.overview;

import com.jetbulb.spring.overview.infrastructure.Metro;
import com.jetbulb.spring.overview.infrastructure.Tunnel;
import com.jetbulb.spring.overview.station.ElectricityStation;
import com.jetbulb.spring.overview.station.WaterpumpStation;
import com.jetbulb.spring.overview.station.petrol.PetrolStation;
import com.jetbulb.spring.overview.station.railway.RailwayStation;
import org.springframework.beans.factory.annotation.Autowired;

public class DistrictSystem {

    /**
     * Класс {@link DistrictSystem} имеет зависимости на классы:
     * {@link ElectricityStation}, {@link WaterpumpStation},
     * {@link RailwayStation}, {@link PetrolStation}, {@link Tunnel}
     */
    private final ElectricityStation electricityStation;
    private final WaterpumpStation waterpumpStation;
    private final RailwayStation railwayStation;
    private final PetrolStation petrolStation;
    private final Tunnel tunnel;
    private final Metro metro;

    /**
     * При помощи аннотации {@link Autowired}, Spring-IoC контейнер сможет внедрить объекты-зависимости.
     */
    @Autowired
    public DistrictSystem(ElectricityStation electricityStation,
                          WaterpumpStation waterpumpStation,
                          RailwayStation railwayStation,
                          PetrolStation petrolStation,
                          Tunnel tunnel,
                          Metro metro) {
        this.electricityStation = electricityStation;
        this.waterpumpStation = waterpumpStation;
        this.railwayStation = railwayStation;
        this.petrolStation = petrolStation;
        this.tunnel = tunnel;
        this.metro = metro;
    }

    @Override
    public String toString() {
        return "DistrictSystem{" +
                "\n\telectricityStation=" + electricityStation +
                ", \n\twaterpumpStation=" + waterpumpStation +
                ", \n\trailwayStation=" + railwayStation +
                ", \n\tpetrolStation=" + petrolStation +
                ", \n\ttunnel=" + tunnel +
                ", \n\tmetro=" + metro +
                "\n}";
    }

}
