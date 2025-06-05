import java.util.Vector;

public class Author {

    private String name;
    private String biography;

    /**
     * List of books written by the author
     */
    public Vector<Book> myBook;

    // Constructor
    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
        this.myBook = new Vector<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for biography
    public String getBiography() {
        return biography;
    }

    // Setter for biography
    public void setBiography(String biography) {
        this.biography = biography;
    }

    // Add a book to author's book list
    public void addBook(Book book) {
        myBook.add(book);
    }

    // Remove a book
    public void removeBook(Book book) {
        myBook.remove(book);
    }

    // Get list of all books by the author
    public Vector<Book> getBooks() {
        return myBook;
    }
}
