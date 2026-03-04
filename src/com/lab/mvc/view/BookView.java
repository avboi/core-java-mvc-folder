package com.lab.mvc.view;

import com.lab.mvc.model.Book;
import java.util.List;
import java.util.Scanner;
public class BookView {
    private final Scanner sc = new Scanner(System.in);
    public void showMenuMain() {
        System.out.println("\n=== Library Manager (Core Java MVC) ===");
        System.out.println("1. View all books");
        System.out.println("2. Exit");
        System.out.print("Choose: ");
    }
    public int readChoice() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter number: ");
            sc.next();
        }
        int c = sc.nextInt();
        sc.nextLine();
        return c;
    }
    public void showBooks(List<Book> books) {
        System.out.println("\n--- Book List ---");
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void showMenuDelete() {
        System.out.println("\n=== Library Manager (Delete Book) ===");
        System.out.println("1. View all books");
        System.out.println("2. Delete book by ID");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }

    public int readId() {
        System.out.print("Enter book ID to delete: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter number: ");
            sc.next();
        }
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public void message(String msg) {
        System.out.println(msg);
    }
}
