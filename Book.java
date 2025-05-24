import java.util.Vector;

public class Book {

  private String title;

  private String isbn;

  public Integer publicationYear;

    /**
   * 
   * @element-type Author
   */
  public Vector  myAuthor;
    /**
   * 
   * @element-type Loan
   */
  public Vector  myLoan;

  public String getBookNameById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book.getName();
            }
        }
        return "Book not found";
    }
}

  public String getIsbn() {
  return null;
  }

  public integer getPublicationYear() {
  return null;
  }

}