import java.util.Vector;

public class Member {

    private String name;
    private int memberId;

    /**
     * List of loans associated with the member
     */
    public Vector<Loan> myLoan;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.myLoan = new Vector<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Setter for memberId
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    // Add a loan
    public void addLoan(Loan loan) {
        myLoan.add(loan);
    }

    // Remove a loan
    public void removeLoan(Loan loan) {
        myLoan.remove(loan);
    }

    // Get all loans
    public Vector<Loan> getLoans() {
        return myLoan;
    }
}
