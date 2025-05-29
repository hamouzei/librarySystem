import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private String name;
    private int employeeId;
    private List<Book> books;

    public Librarian(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());
    }

    public void removeBook(Book b) {
        if (books.remove(b)) {
            System.out.println("Book removed: " + b.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public List<Book> getBooks() {
        return books;
    }
}
