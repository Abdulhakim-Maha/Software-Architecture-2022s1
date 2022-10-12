package com.solid.book;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BookPublisher book_pub = new BookPublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book_pub.printToFile();
        BookReader book_read = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book_read.printToScreen();
    }
}