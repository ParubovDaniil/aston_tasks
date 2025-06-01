package com.parubovdaniil_astontasks.HomeWork1.task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------");
        Fish fish = new Fish();
        System.out.println(fish.isAlive());
        fish.livesInWater();
        fish.moveable();
        fish.feelable();

        System.out.println("--------------");

        Whale whale = new Whale();
        System.out.println(whale.isAlive());
        whale.livesInWater();
        whale.moveable();
        whale.feelable();
        whale.hasSpine();

        System.out.println("--------------");

        Cat cat = new Cat();
        System.out.println(cat.isAlive());
        // cat.livesInWater();
        cat.moveable();
        cat.feelable();
        cat.hasSpine();
        cat.hasFur();

        System.out.println("--------------");

        Bear bear = new Bear();
        System.out.println(bear.isAlive());
        // bear.livesInWater();
        bear.moveable();
        bear.feelable();
        bear.hasSpine();
        bear.hasFur();

    }
}
