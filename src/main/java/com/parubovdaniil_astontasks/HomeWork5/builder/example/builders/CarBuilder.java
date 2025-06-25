package com.parubovdaniil_astontasks.HomeWork5.builder.example.builders;

import com.parubovdaniil_astontasks.HomeWork5.builder.example.cars.Car;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.cars.CarType;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.Engine;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.GPSNavigator;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.Transmission;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
