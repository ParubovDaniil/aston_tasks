package com.parubovdaniil_astontasks.HomeWork4.task1;

public class DeadLock {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: захватил ресурс 1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    System.out.println("Thread 1: захватил ресурс 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: захватил ресурс 2");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (resource1) {
                    System.out.println("Thread 2: захватил ресурс 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
