package com.parubovdaniil_astontasks.HomeWork1.task1;

public class Cat extends Mammal {
    private final Fur fur = new Fur();

    public boolean hasFur() {
        return fur.hasFur();
    }

    @Override
    public boolean isAlive() {
        System.out.print("Я живой кот:");
        return super.isAlive();
    }

    @Override
    public void moveable() {
        System.out.println("Я двигаюсь преимущественно по земле");
    }
}
