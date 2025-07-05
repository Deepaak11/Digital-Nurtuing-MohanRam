package org.example.service;

import org.example.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // ✅ Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        bookRepository.fetchBooks();
        System.out.println("Books fetched successfully!");
    }
}
