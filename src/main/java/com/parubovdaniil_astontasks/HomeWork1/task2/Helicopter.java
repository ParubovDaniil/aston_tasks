package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Helicopter extends AbstractTransport {
    private final Wheels wheels = new Wheels(true);
    private final Vint vint = new Vint(true);
    private final Wings wings = new Wings(false);

    @Override
    public boolean hasWheels() {
        System.out.print("У Вертолёта есть колёса: ");
        return wheels.hasWheels();
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Вертолёта есть винт: ");
        return vint.hasVint();
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Вертолёта есть крылья: ");
        return wings.hasWings();
    }

    public boolean carriesCargo() {
        System.out.print("Вертолёт перевозит грузы: ");
        return true;
    }
}