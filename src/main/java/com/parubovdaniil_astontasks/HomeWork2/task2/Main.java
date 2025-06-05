package com.parubovdaniil_astontasks.HomeWork2.task2;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Daniil", List.of(
                        new Book("War and Pease", 1863, 2144),
                        new Book("BookTest1", 1999, 300),
                        new Book("BookTest2", 2000, 2000))),
                new Student("Vyacheslav", List.of(
                        new Book("War and Pease", 1863, 2144),
                        new Book("BookTest3", 1998, 350),
                        new Book("BookTest4", 2001, 2001))),
                new Student("Ivan", List.of(
                        new Book("War and Pease", 1863, 2144),
                        new Book("BookTest5", 1997, 400),
                        new Book("BookTest6", 2002, 2002))));
        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга не найдена"));
    }
}