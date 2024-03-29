public class Auto implements Loan {

    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public Auto(String applicantName) {
        this.applicantName = applicantName;
    }

    public Auto(String applicantName, double loanAmount, float interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        System.out.println("Auto:: Interest()");
        return 3.4d;
    }

    @Override
    public String toString() {
        return "Application name: " + applicantName + "\nLoan amount: " + loanAmount + "\nInterest rate: " + interestRate;
    }
}