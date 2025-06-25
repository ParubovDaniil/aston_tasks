package com.parubovdaniil_astontasks.HomeWork5.builder.example.builders;

import com.parubovdaniil_astontasks.HomeWork5.builder.example.cars.CarType;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.Engine;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.GPSNavigator;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.Transmission;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
