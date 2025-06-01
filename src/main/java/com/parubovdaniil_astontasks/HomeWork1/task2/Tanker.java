package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Tanker extends AbstractTransport{

    @Override
    public boolean hasWheels() {
        System.out.print("У Танкера есть колёса ");
        return false;
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Танкера есть винт ");
        return true;
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Танкера есть крылья ");
        return false;
        }

    @Override
    public boolean carriesCargo() {
        System.out.print("Танкер перевозит грузы ");
        return true;
        }
}
