package com.parubovdaniil_astontasks.HomeWork1.task1;

public abstract class Mammal extends Animal implements HasSpine {
    protected Spine spine = new Spine();

    @Override
    public boolean hasSpine() {
        return spine.hasSpine();
    }

    @Override
    public void feelable() {
        System.out.println("Я могу видеть по своему");
        System.out.println("Я могу слышать по своему");
        System.out.println("...");
    }
}