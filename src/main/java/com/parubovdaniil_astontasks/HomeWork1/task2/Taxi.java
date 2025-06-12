package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Taxi extends AbstractTransport {
    private final Wheels wheels = new Wheels(true);

    @Override
    public boolean hasWheels() {
        System.out.print("У Такси есть колёса: ");
        return wheels.hasWheels();
    }
}