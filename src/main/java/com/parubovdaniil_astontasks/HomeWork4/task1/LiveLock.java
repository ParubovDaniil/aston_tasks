package com.parubovdaniil_astontasks.HomeWork4.task1;

public class LiveLock {
    private static final String LESSON_TAKEN_BY_STUDENT1 = "Урок взят Студентом 1";
    private static final String LESSON_TAKEN_BY_STUDENT2 = "Урок взят Студентом 2";

    private static String lessonStatus = "Доступен для прохождения";
    private final Object lesson = new Object();

    public void tryCompleteLesson() {
        Thread student1 = new Thread(() -> {
            while(true) {
                synchronized(lesson) {
                    if (!LESSON_TAKEN_BY_STUDENT1.equals(lessonStatus)) {
                        lessonStatus = LESSON_TAKEN_BY_STUDENT1;
                        System.out.println("Студент 1 начал проходить урок");
                    }
                }
                try {
                    System.out.println("Студент 1 пытается завершить урок...\n");
                    Thread.sleep(2000);
                } catch(InterruptedException e) {
                    System.err.println("Ошибка у Студента 1: " + e.getMessage());
                }
                synchronized(lesson) {
                    if (LESSON_TAKEN_BY_STUDENT1.equals(lessonStatus)) {
                        System.out.println("Студент 1 завершил урок");
                        break;
                    }
                }
            }
        });

        Thread student2 = new Thread(() -> {
            try {
                System.out.println("Студент 2 медленно подключается к уроку\n");
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.err.println("Ошибка у Студента 2: " + e.getMessage());
            }
            while(true) {
                synchronized(lesson) {
                    if (!LESSON_TAKEN_BY_STUDENT2.equals(lessonStatus)) {
                        lessonStatus = LESSON_TAKEN_BY_STUDENT2;
                        System.out.println("Студент 2 начал проходить урок");
                    }
                }
                try {
                    System.out.println("Студент 2 пытается завершить урок...\n");
                    Thread.sleep(2000);
                } catch(InterruptedException e) {
                    System.err.println("Ошибка у Студента 2: " + e.getMessage());
                }
                synchronized(lesson) {
                    if (LESSON_TAKEN_BY_STUDENT2.equals(lessonStatus)) {
                        System.out.println("Студент 2 завершил урок");
                        break;
                    }
                }
            }
        });

        student1.start();
        student2.start();
    }
}
class ForBegin{
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        LiveLock liveLock = new LiveLock();
        liveLock.tryCompleteLesson();
    }
}

