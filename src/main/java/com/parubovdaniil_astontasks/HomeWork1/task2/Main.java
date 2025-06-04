package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        Airplane airplane = new Airplane();
        System.out.println(airplane.hasWheels());
        System.out.println(airplane.hasVint());
        System.out.println(airplane.hasWings());
        System.out.println(airplane.carriesCargo());
        System.out.println("---------------------------------");
        Helicopter helicopter = new Helicopter();
        System.out.println(helicopter.hasWheels());
        System.out.println(helicopter.hasVint());
        System.out.println(helicopter.hasWings());
        System.out.println(helicopter.carriesCargo());
        System.out.println("---------------------------------");
        Boat boat = new Boat();
        System.out.println(boat.hasWheels());
        System.out.println(boat.hasVint());
        System.out.println(boat.hasWings());
        System.out.println(boat.carriesCargo());
        System.out.println("---------------------------------");
        Tanker tanker = new Tanker();
        System.out.println(tanker.hasWheels());
        System.out.println(tanker.hasVint());
        System.out.println(tanker.hasWings());
        System.out.println(tanker.carriesCargo());
        System.out.println("---------------------------------");
        Taxi taxi = new Taxi();
        System.out.println(taxi.hasWheels());
        System.out.println(taxi.hasVint());
        System.out.println(taxi.hasWings());
        System.out.println(taxi.carriesCargo());
        System.out.println("---------------------------------");
        Truck truck = new Truck();
        System.out.println(truck.hasWheels());
        System.out.println(truck.hasVint());
        System.out.println(truck.hasWings());
        System.out.println(truck.carriesCargo());
        System.out.println("---------------------------------");
    }
}