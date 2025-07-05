package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String message;

    // Constructor for constructor injection
    public BookService(String message) {
        this.message = message;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Message: " + message);
        bookRepository.fetchBooks();
        System.out.println("Books displayed successfully.");
    }
}
