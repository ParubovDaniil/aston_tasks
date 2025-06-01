package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Boat extends AbstractTransport{


    @Override
    public boolean hasWheels() {
        System.out.print("У Катера есть колёса ");
        return false;
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Катера есть винт ");
        return true;
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Катера есть крылья ");
        return false;
        }

    @Override
    public boolean carriesCargo() {
        System.out.print("Катер перевозит грузы ");
        return true;
        }
}
