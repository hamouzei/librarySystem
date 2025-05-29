import java.util.Date;

public class Loan {

  private Date loanDate;
  private Date returnDate;

  public Book myBook;
  public Member myMember;

  // Constructor
  public Loan(Date loanDate, Date returnDate, Book myBook, Member myMember) {
    this.loanDate = loanDate;
    this.returnDate = returnDate;
    this.myBook = myBook;
    this.myMember = myMember;
  }

  // Getters
  public Date getLoanDate() {
    return loanDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  // Setters (optional)
  public void setLoanDate(Date loanDate) {
    this.loanDate = loanDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public void setMyBook(Book myBook) {
    this.myBook = myBook;
  }

  public void setMyMember(Member myMember) {
    this.myMember = myMember;
  }

  // Optional: override toString() for easy display
  @Override
  public String toString() {
    return "Loan [loanDate=" + loanDate + ", returnDate=" + returnDate +
           ", myBook=" + myBook + ", myMember=" + myMember + "]";
  }
}
