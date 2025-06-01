package com.parubovdaniil_astontasks.HomeWork1.task1;

public abstract class Mammal extends Animal implements HasSpine {

    @Override
    public void feelable() {
        System.out.println("Я могу видеть по своему");
        System.out.println("Я могу слышать по своему");
        System.out.println("...");
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public abstract void moveable();

    @Override
    public boolean hasSpine() {
        System.out.println("У меня есть позвоночник");
        return true;
    }

}
