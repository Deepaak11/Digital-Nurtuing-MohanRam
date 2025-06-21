package library;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager(10);

        manager.addBook(new Book(1, "Java Programming", "Mohan Ram"));
        manager.addBook(new Book(2, "Data Structures", "Saravanan"));
        manager.addBook(new Book(3, "Algorithms", "Saravanan"));
        manager.addBook(new Book(4, "Operating Systems", "Mohana Kumar"));

        manager.displayAllBooks();


        System.out.println("\nLinear Search for 'Algorithms':");
        Book result1 = manager.linearSearchByTitle("Algorithms");
        System.out.println(result1 != null ? result1 : "Book not found");


        System.out.println("\nBinary Search for 'Data Structures':");
        Book result2 = manager.binarySearchByTitle("Data Structures");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
