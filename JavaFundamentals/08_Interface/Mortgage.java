public class Mortgage implements Loan {

    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public Mortgage(String applicantName) {
        this.applicantName = applicantName;
    }

    public Mortgage(String applicantName, double loanAmount, float interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Mortgage:: Interest()");
        return 3.4d;
    }

    @Override
    public String toString() {
        return "Application name: " + applicantName + "\nLoan amount: " + loanAmount + "\nInterest rate: " + interestRate;
    }
}