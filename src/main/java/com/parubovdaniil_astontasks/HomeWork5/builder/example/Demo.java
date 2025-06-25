package com.parubovdaniil_astontasks.HomeWork5.builder.example;

import com.parubovdaniil_astontasks.HomeWork5.builder.example.builders.CarBuilder;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.builders.CarManualBuilder;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.cars.Car;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.cars.Manual;
import com.parubovdaniil_astontasks.HomeWork5.builder.example.director.Director;


public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
