package com.parubovdaniil_astontasks.HomeWork1.task1;

public class Whale extends Mammal implements LiveInWater {

    @Override
    public void livesInWater() {
        System.out.println("Живу в воде");
    }

    @Override
    public boolean isAlive() {
        System.out.print("Я живой кит:");
        return super.isAlive();
    }

    @Override
    public void moveable() {
        System.out.println("Я двигаюсь по водной среде");
    }
    
}
