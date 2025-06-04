package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Truck extends AbstractTransport {
    private final Wheels wheels = new Wheels(true);
    private final Vint vint = new Vint(false);
    private final Wings wings = new Wings(false);

    @Override
    public boolean hasWheels() {
        System.out.print("У грузовика есть колёса: ");
        return wheels.hasWheels();
    }

    @Override
    public boolean hasVint() {
        System.out.print("У грузовика есть винт: ");
        return vint.hasVint();
    }

    @Override
    public boolean hasWings() {
        System.out.print("У грузовика есть крылья: ");
        return wings.hasWings();
    }

    public boolean carriesCargo() {
        System.out.print("Грузовик перевозит грузы: ");
        return true;
    }
}
