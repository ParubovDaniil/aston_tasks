package com.parubovdaniil_astontasks.HomeWork4.task1;

public class LiveLock {
    static class JavaRush {
        private boolean isAvailable = true;
    }

    static class JavaStudent {
        private String name;
        private JavaRush javarush;

        public JavaStudent(String name, JavaRush javarush) {
            this.name = name;
            this.javarush = javarush;
        }

        public void eat() {
            while (true) {
                if (javarush.isAvailable) {
                    javarush.isAvailable = false;
                    System.out.println(name + " попытался пройти урок");
                    try { Thread.sleep(50); } catch (InterruptedException e) {}
                    System.out.println(name + " прошёл");
                    javarush.isAvailable = true;
                    break;
                } else {
                    System.out.println(name + " ждет месяц");
                }
            }
        }
    }

    public static void main(String[] args) {
        JavaRush javarush = new JavaRush();

        JavaStudent p1 = new JavaStudent("СтудентДжавы 1", javarush);
        JavaStudent p2 = new JavaStudent("СтудентДжавы 2", javarush);

        Thread t1 = new Thread(p1::eat);
        Thread t2 = new Thread(p2::eat);

        t1.start();
        t2.start();
    }
}
