package com.parubovdaniil_astontasks.HomeWork2.task1;

import java.util.LinkedList;

public class MyHashSet<T> {
    private static final int DEFAULT_CAPACITY = 16; //(из исходного HashSet)
    private LinkedList<T>[] buckets; 

    public MyHashSet() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(T element) {
        int index = getBucketIndex(element);
        if (!buckets[index].contains(element)) {
            buckets[index].add(element);
        }
    }

    public void remove(T element) {
        int index = getBucketIndex(element);
        buckets[index].remove(element);
    }

    private int getBucketIndex(T element) {
        int hashCode = element.hashCode();
        int index = Math.abs(hashCode) % buckets.length;
        return index;
    }
}