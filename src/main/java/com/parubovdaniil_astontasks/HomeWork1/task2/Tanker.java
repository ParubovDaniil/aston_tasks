package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Tanker extends AbstractTransport implements CarriesCargo{
    private final Vint vint = new Vint(true);

    @Override
    public boolean hasVint() {
        System.out.print("У Танкера есть винт: ");
        return vint.hasVint();
    }

    @Override
    public boolean carriesCargo() {
        System.out.print("Танкер перевозит грузы: ");
        return true;
    }
}