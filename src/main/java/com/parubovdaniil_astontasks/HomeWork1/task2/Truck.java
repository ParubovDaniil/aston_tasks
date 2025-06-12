package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Truck extends AbstractTransport implements CarriesCargo {
    private final Wheels wheels = new Wheels(true);

    @Override
    public boolean hasWheels() {
        System.out.print("У грузовика есть колёса: ");
        return wheels.hasWheels();
    }

    @Override
    public boolean carriesCargo() {
        System.out.print("Грузовик перевозит грузы: ");
        return true;
    }
}
