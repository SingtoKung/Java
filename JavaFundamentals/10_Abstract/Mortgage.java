public class Mortgage extends BaseLoan implements Payment {
    public Mortgage(String applicantName) {
        super(applicantName);
    }

    public Mortgage(String applicantName, double loanAmount, float interestRate) {
        super(applicantName, loanAmount, interestRate);
    }

    public double calculateInterest() {
        System.out.println("Mortgage:: calculateInterest() called");
        return 3.3d;
    }

    public String[] paymentOptions() {
        System.out.println("Mortgage:: paymentOptions()");
        return new String[] {"VISA", "Cash"};
    }
}
