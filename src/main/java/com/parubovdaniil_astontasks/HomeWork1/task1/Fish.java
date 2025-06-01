package com.parubovdaniil_astontasks.HomeWork1.task1;

class Fish extends Animal implements LiveInWater {

    @Override
    public boolean isAlive() {
        System.out.print("Я живая рыба:");
        return super.isAlive();
    }

    @Override
    public void moveable() {
        System.out.println("Я могу плавать");
    }

    @Override
    public void feelable() {
        System.out.println("Я могу видеть под водой");
        System.out.println("Я могу слышать под водой");
        System.out.println("...");
    }

    @Override
    public void livesInWater() {
        System.out.println("Живу в воде");
    }

}
