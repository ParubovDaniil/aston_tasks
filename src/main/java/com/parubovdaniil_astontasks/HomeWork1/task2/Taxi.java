package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Taxi extends AbstractTransport{

    @Override
    public boolean hasWheels() {
        System.out.print("У Такси есть колёса ");
        return true;
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Такси есть винт ");
        return false;
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Такси есть крылья ");
        return false;
        }

    @Override
    public boolean carriesCargo() {
        System.out.print("Такси перевозит грузы ");
        return false;
        }
    
}
