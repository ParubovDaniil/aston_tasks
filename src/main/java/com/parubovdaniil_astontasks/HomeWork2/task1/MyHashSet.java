package com.parubovdaniil_astontasks.HomeWork2.task1;

import java.util.Arrays;
import java.util.Objects;

public class MyHashSet<T> {
    private static final int INITIAL_CAPACITY = 8;
    private static final float LOAD_FACTOR = 0.75f;

    private Node<T>[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashSet() {
        data = (Node<T>[]) new Node[INITIAL_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSet" + Arrays.toString(data);
    }

    private static int getHash(Object element) {
        return element != null ? element.hashCode() : 0;
    }

    private static int getIndex(int hash, int dataLength) {
        return hash % dataLength;
    }

    private static final class Node<T> {
        private final int hash;
        private final T element;
        private Node<T> next;

        private Node(int hash, T element, Node<T> next) {
            this.hash = hash;
            this.element = element;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(element, node.element);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(element);
        }

        @Override
        public String toString() {
            String currentElement = String.valueOf(element);
            String nextElement = next != null ? " -> " + next : "";

            return currentElement + nextElement;
        }
    }

    public boolean remove(T element) {
        int hash = getHash(element);
        int index = getIndex(hash, data.length);

        Node<T> previous = null;
        Node<T> current = data[index];

        if (current == null) {
            return false;
        }

        while (true) {
            if (current.hash == hash && Objects.equals(current.element, element)) {
                if (previous == null) {
                    data[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                break;
            }
            if (current.next == null) {
                return false;
            }
            previous = current;
            current = current.next;
        }
        size--;
        return true;
    }

    public boolean contains(T element) {
        int hash = getHash(element);
        int index = getIndex(hash, data.length);

        Node<T> current = data[index];

        if (element == null) {
            while (current != null) {
                if (current.element == null) {
                    return true;
                }
                current = current.next;
            }
            return false;
        } else {
            while (current != null) {
                if (current.hash == hash && Objects.equals(current.element, element)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }

    public boolean add(T element) {
        int hash = getHash(element);
        int index = getIndex(hash, data.length);

        Node<T> current = data[index];

        if (current == null) {
            data[index] = new Node<>(hash, element, null);
        } else {
            while (true) {
                if (current.hash == hash && Objects.equals(current.element, element)) {
                    return false;
                }
                if (current.next == null) {
                    current.next = new Node<>(hash, element, null);
                    break;
                }
                current = current.next;
            }
        }
        size++;
        if (size > data.length * LOAD_FACTOR) {
            resize();
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        Node<T>[] oldData = data;
        data = (Node<T>[]) new Node[oldData.length * 2];

        for (Node<T> head : oldData) {
            while (head != null) {
                Node<T> nextElement = head.next;
                int newIndex = getIndex(head.hash, data.length);
                head.next = data[newIndex];
                data[newIndex] = head;
                head = nextElement;
            }
        }
        System.out.printf("При добавлении %s-го элемента происходит увеличение размера коллекции с %s на %s%n",
                size + 1,
                oldData.length,
                data.length);
    }
}