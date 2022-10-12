package com.solid.book;

import java.util.List;

public class BookReader {

    private String title;
    private List<String> pages;

    public BookReader(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
    }


    public void printToScreen() {
        Book book = new Book(title, pages);
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
