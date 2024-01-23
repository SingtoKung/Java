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

    public String getApplicationName() {
        return applicationName;
    }

    public float getInterestRate() {
        return interestRate;
    }

    private double calculateInterest() {
        return this.loanAmount * this.interestRate / 100;
    }

    public double cal() {
        return this.calculateInterest();
    }

    public double cal(double loanAmount, float interestRate) {
        return loanAmount * interestRate / 100;
    }

    public String toString() {
        return "Application name: " + applicationName + "\nLoan amount: " + loanAmount + "\nInterest rate: " + interestRate;
    }
}
