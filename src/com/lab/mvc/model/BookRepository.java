package com.lab.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();
    private int nextId = 1;
    public BookRepository() {
// Sample data
        books.add(new Book(nextId++, "Clean Code", "Robert C. Martin"));
        books.add(new Book(nextId++, "Effective Java", "Joshua Bloch"));
    }
    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public java.util.List<Book> searchByTitle(String keyword) {
        String k = keyword.toLowerCase();
        java.util.List<Book> result = new java.util.ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(k)) {
                result.add(b);
            }
        }
        return result;
    }
}