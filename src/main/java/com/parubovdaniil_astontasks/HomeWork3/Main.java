package com.parubovdaniil_astontasks.HomeWork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Записать данные в файл");
            System.out.println("2 - Прочитать данные из файла");
            System.out.println("3 - Выйти");
            System.out.print("Введите номер действия: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Некорректный ввод. Попробуйте снова.");
                scanner.nextLine(); 
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите путь к файлу: ");
                    String pathToWrite = scanner.nextLine();

                    System.out.println("Введите данные для записи:");
                    String dataToWrite = scanner.nextLine();

                    try {
                        new FileHandler(pathToWrite).writeData(dataToWrite);
                        System.out.println("Данные успешно записаны.");
                    } catch (FileWriteException e) {
                        System.err.println("Ошибка при записи: " + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.print("Введите путь к файлу: ");
                    String pathToRead = scanner.nextLine();

                    try {
                        String content = new FileHandler(pathToRead).readData();
                        System.out.println("Содержимое файла:\n" + content);
                    } catch (FileReadException e) {
                        System.err.println("Ошибка при чтении: " + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Выход из программы. До свидания!");
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}
