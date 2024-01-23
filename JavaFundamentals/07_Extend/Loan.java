public class Loan {
    // If add private, we can't change value after call class.
    private String applicationName;
    private double loanAmount;
    private float interestRate;

    public Loan(String applicationName) {
        this.applicationName = applicationName;
    }

    public Loan(String applicationName, double loanAmount, float interestRate) {
        this.applicationName = applicationName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        System.out.println("Loan:: getInterestRate");
        return interestRate;
    }

    public double calculateInterest() {
        System.out.println("Loan:: calculateInterest");
        return this.loanAmount * this.interestRate / 100;
    }

    public String toString() {
        return "Application name: " + applicationName + "\nLoan amount: " + loanAmount + "\nInterest rate: " + interestRate;
    }
}
