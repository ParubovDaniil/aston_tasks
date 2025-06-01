package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Truck extends AbstractTransport{

    @Override
    public boolean hasWheels() {
        System.out.print("У грузовика есть колёса ");
        return true;
    }

    @Override
    public boolean hasVint() {
        System.out.print("У грузовика есть винт ");
        return false;
    }

    @Override
    public boolean hasWings() {
        System.out.print("У грузовика есть крылья ");
        return false;
        }

    @Override
    public boolean carriesCargo() {
        System.out.print("Грузовик перевозит грузы ");
        return true;
        }
}
