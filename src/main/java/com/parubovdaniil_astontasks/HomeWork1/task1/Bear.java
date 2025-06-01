package com.parubovdaniil_astontasks.HomeWork1.task1;

public class Bear extends Mammal implements HasFur {

    @Override
    public boolean hasFur() {
        System.out.println("У меня медвежья шерсть: ");
        return true;
    }

    @Override
    public boolean isAlive() {
        System.out.print("Я живой медведь:");
        return super.isAlive();
    }

    @Override
    public void moveable() {
        System.out.println("Я двигаюсь преимущественно по земле");
    }
}
