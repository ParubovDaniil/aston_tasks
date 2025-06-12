package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Helicopter extends AbstractTransport implements CarriesCargo{
    private final Wheels wheels = new Wheels(true);
    private final Vint vint = new Vint(true);

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
    public boolean carriesCargo() {
        System.out.print("Вертолёт перевозит грузы: ");
        return true;
    }
}