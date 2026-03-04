package com.lab.mvc.controller;

import com.lab.mvc.model.BookRepository;
import com.lab.mvc.view.BookView;

public class BookController {
    private final BookRepository repo;
    private final BookView view;
    public BookController(BookRepository repo, BookView view) {
        this.repo = repo;
        this.view = view;
    }
    public void start() {
        boolean run = true;
        while (run) {
            view.showMenuMain();
            int choice = view.readChoice();
            switch (choice) {
                case 1 -> view.showBooks(repo.findAll());
                case 2 -> { view.message("Bye!"); run = false; }
                default -> view.message("Choose 1 or 2 only.");
            }
        }
    }
}
