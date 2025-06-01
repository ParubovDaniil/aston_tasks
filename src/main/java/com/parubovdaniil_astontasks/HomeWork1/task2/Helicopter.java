package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Helicopter extends AbstractTransport{

    @Override
    public boolean hasWheels() {
        System.out.print("У Вертолёта есть колёса ");
        return true;
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Вертолёта есть винт ");
        return true;
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Вертолёта есть крылья ");
        return false;
        }

    @Override
    public boolean carriesCargo() {
        System.out.print("Вертолёт перевозит грузы ");
        return true;
        }
    
}
