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

    public boolean deleteById(int id) {
        Book target = null;
        for (Book b : books) {
            if (b.getId() == id) {
                target = b;
                break;
            }
        }
        if (target == null) return false;
        books.remove(target);
        return true;
    }
}