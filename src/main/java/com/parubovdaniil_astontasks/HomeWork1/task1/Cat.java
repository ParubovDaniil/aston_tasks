package com.parubovdaniil_astontasks.HomeWork1.task1;

public class Cat extends Mammal implements HasFur{

    @Override
    public boolean hasFur() {
        System.out.println("У меня кошачья шерсть ");
        return true;
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
