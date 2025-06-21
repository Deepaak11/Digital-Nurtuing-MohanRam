package library;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManager {
    private Book[] books;
    private int count;

    public LibraryManager(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full!");
        }
    }


    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }


    public Book binarySearchByTitle(String title) {
        // Sort the books before binary search
        Arrays.sort(books, 0, count, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        int low = 0, high = count - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public void displayAllBooks() {
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
