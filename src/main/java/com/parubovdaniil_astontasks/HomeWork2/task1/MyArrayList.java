package com.parubovdaniil_astontasks.HomeWork2.task1;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {

    private static final int DEFAULT_CAPACITY = 10;//(из исходного ArrayList)
    Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("вместимость должна быть положительной");
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    private void increaseCapasity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void add(T element) {
        if (size == elements.length) {
            increaseCapasity();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("индекс: " + index + ", размер: " + size);
        }
        return (T)elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("индекс: " + index + ", размер: " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void addAll(Collection<? extends T> collection) {
        if (size + collection.size() > elements.length) {
            increaseCapacity(size + collection.size());
        }
        for (T element : collection) {
            elements[size++] = element;
        }
    }

    private void increaseCapacity(int minCapacity) {
        int newCapacity = Math.max(elements.length * 2, minCapacity);
        elements = Arrays.copyOf(elements, newCapacity);
    }

}
