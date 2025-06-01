package com.parubovdaniil_astontasks.HomeWork1.task1;

abstract class Animal {

    private boolean isAlive; // состояние живое

    public Animal() {
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract void moveable();

    public abstract void feelable();

}
// Животное - живое существо, обладающее способностью двигаться и чувствовать