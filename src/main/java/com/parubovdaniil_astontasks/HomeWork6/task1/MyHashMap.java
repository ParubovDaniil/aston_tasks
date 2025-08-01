package com.parubovdaniil_astontasks.HomeWork6.task1;

import java.util.Arrays;
import java.util.Objects;
public class MyHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 8;
    private static final float LOAD_FACTOR = 0.75f;
    private Node<K, V>[] data;
    private int size;
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        data = (Node<K, V>[]) new Node[INITIAL_CAPACITY];
    }
    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "MyHashMap" + Arrays.toString(data);
    }
    private static int getHash(Object key) {
        return key != null ? key.hashCode() : 0;
    }
    private static int getIndex(int hash, int dataLength) {
        return hash % dataLength;
    }
    private static final class Node<K, V> {
        private final int hash;
        private final K key;
        private V value;
        private Node<K, V> next;
        private Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return Objects.equals(key, node.key);
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(key);
        }
        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
    public V get(K key) {
        int hash = getHash(key);
        int index = getIndex(hash, data.length);
        Node<K, V> current = data[index];
        while (current != null) {
            if (current.hash == hash && Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public V put(K key, V value) {
        int hash = getHash(key);
        int index = getIndex(hash, data.length);
        Node<K, V> current = data[index];
        while (current != null) {
            if (current.hash == hash && Objects.equals(current.key, key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }
        
        Node<K, V> newNode = new Node<>(hash, key, value, data[index]);
        data[index] = newNode;
        size++;
        
        if (size > data.length * LOAD_FACTOR) {
            resize();
        }
        return null;
    }
    public V remove(K key) {
        int hash = getHash(key);
        int index = getIndex(hash, data.length);
        Node<K, V> current = data[index];
        Node<K, V> previous = null;
        while (current != null) {
            if (current.hash == hash && Objects.equals(current.key, key)) {
                if (previous == null) {
                    data[index] = current.next;
                } else {
                    previous.next = current.next; 
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    private void resize() {
        Node<K, V>[] oldData = data;
        data = (Node<K, V>[]) new Node[oldData.length * 2];
        for (Node<K, V> head : oldData) {
            while (head != null) {
                Node<K, V> nextElement = head.next;
                int newIndex = getIndex(head.hash, data.length);
                head.next = data[newIndex];
                data[newIndex] = head;
                head = nextElement;
            }
        }
        System.out.printf("При добавлении %s-го элемента - увеличиваю размер коллекции с %s на %s%n",
                size + 1,
                oldData.length,
                data.length);
    }
}