package com.parubovdaniil_astontasks.HomeWork1.task2;

public class Airplane extends AbstractTransport {

    @Override
    public boolean hasWheels() {
        System.out.print("У Самолёта есть колёса ");
        return true;
    }

    @Override
    public boolean hasVint() {
        System.out.print("У Самолёта есть винт ");
        return true;
    }

    @Override
    public boolean hasWings() {
        System.out.print("У Самолёта есть крылья ");
        return true;
        }

    @Override
    public boolean carriesCargo() {
        System.out.print("Самолёт перевозит грузы ");
        return true;
        }

}
