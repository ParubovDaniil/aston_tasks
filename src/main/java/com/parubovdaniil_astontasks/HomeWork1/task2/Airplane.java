package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Airplane extends AbstractTransport implements CarriesCargo {
    private final Wheels wheels = new Wheels(true);
    private final Vint vint = new Vint(true);
    private final Wings wings = new Wings(true);

    @Override
    public boolean hasWheels() {
        System.out.print("У Самолёта есть колёса: ");
        return wheels.hasWheels();
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Самолёта есть винт: ");
        return vint.hasVint();
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Самолёта есть крылья: ");
        return wings.hasWings();
    }

    @Override
    public boolean carriesCargo() {
        System.out.print("Самолёт перевозит грузы: ");
        return true;
    }
}
