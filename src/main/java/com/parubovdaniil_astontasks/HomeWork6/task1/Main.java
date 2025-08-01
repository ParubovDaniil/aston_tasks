package com.parubovdaniil_astontasks.HomeWork6.task1;

public class Main {
    public static void main(String[] args) {
        /* Проверяю MyHashMap */
        MyHashMap<String, String> map = new MyHashMap<>();
        
        // Добавляю элемент и выполнение обязательного метода put
        map.put("test1", "value1");
        map.put("test2", "value2");
        System.out.println("Добавлено: test1=value1 и test2=value2");
        
        // Проверка на существование элемента и выполнение обязательного метода get
        String value = map.get("test1");
        System.out.println("Получено значение для test1: " + value);
        
        // Повторно
        map.put("test1", "newValue");
        System.out.println("Обновлено значение для test1 на newValue");
        
        // Удаление элемента
        String removedValue = map.remove("test1");
        System.out.println("Удалено: test1, значение: " + removedValue);
        
        // Проверка на существование после удаления
        value = map.get("test1");
        System.out.println("Проверка существования test1 после удаления: " + (value == null ? "не найден" : "найден"));
    }
}