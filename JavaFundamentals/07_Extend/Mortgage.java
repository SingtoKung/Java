public class Mortgage extends Loan {

    public Mortgage(String applicationName) {
        super(applicationName);
    }

    public Mortgage(String applicationName, double loanAmount, float interestRate) {
        super(applicationName, loanAmount, interestRate);
    }

    @Override
    public double calculateInterest() {
        System.out.println("Mortgage:: calculateInterest");
        return 3.4d;
    }
}