package com.parubovdaniil_astontasks.HomeWork2.task1;

public class Main {
    public static void main(String[] args) {
        /* Проверяю MyArrayList */
        MyArrayList<String> list = new MyArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        list.remove(0);
        System.out.println(list.get(0));

        /* Проверяю MyHashSet */
        MyHashSet<String> set = new MyHashSet<>();
        set.add("test1");
        set.add("test2");
        System.out.println("добавлено: test1 и test2");
        set.add("test1");
        System.out.println("повторное добавление: test1");
        set.remove("test1");
        System.out.println("удалён: test1");
    }
}
