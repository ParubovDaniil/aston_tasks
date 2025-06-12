package com.parubovdaniil_astontasks.HomeWork1.task2;


public class Boat extends AbstractTransport implements CarriesCargo{
    private final Vint vint = new Vint(true);

    @Override
    public boolean hasVint() {
        System.out.print("У Катера есть винт: ");
        return vint.hasVint();
    }

    @Override
    public boolean carriesCargo() {
        System.out.print("Катер перевозит грузы: ");
        return true;
    }
}