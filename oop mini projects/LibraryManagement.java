
import java.util.ArrayList;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("--------------------");
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book Added Successfully!");
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available!");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }

    void searchBook(int id) {
        boolean found = false;

        for (Book b : books) {
            if (b.id == id) {
                b.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!");
        }
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Python Basics", "Guido van Rossum"));
        library.addBook(new Book(103, "C Programming", "Dennis Ritchie"));

        System.out.println("\n===== ALL BOOKS =====");
        library.displayBooks();

        System.out.println("\n===== SEARCH BOOK =====");
        library.searchBook(102);
    }
}
