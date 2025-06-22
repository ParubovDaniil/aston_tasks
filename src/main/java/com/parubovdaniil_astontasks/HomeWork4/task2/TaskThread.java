package com.parubovdaniil_astontasks.HomeWork4.task2;

public class TaskThread {
    public static void main(String[] args) {
        final Printer printer = new Printer();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printer.print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printer.print1(thread2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start(); 
    }

    static class Printer {
        private boolean isPrint1Turn = true;


        public synchronized void print1(Thread thread2) throws InterruptedException {
            thread2.start();
            while (true) {
                System.out.println("1");
                isPrint1Turn = false;
                notify();
                wait();
            }
        }

   
        public synchronized void print2() throws InterruptedException {
            while (true) {
                while (isPrint1Turn) {
                    wait();
                }
                System.out.println("2");
                isPrint1Turn = true;
                notify();
            }
        }
    }
}