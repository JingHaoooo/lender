public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interestRate;
    private String contactNumber;

    public Loan(int amount, String borrower, boolean isPaid, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.isPaid = isPaid;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
    }
}
