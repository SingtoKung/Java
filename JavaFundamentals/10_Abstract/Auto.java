public class Auto extends BaseLoan implements Payment {
    public Auto(String applicantName) {
        super(applicantName);
    }

    public Auto(String applicantName, double loanAmount, float interestRate) {
        super(applicantName, loanAmount, interestRate);
    }

    public double calculateInterest() {
        System.out.println("Auto:: calculateInterest() called");
        return 3.3d;
    }

    public String[] paymentOptions() {
        System.out.println("Auto:: paymentOptions()");
        return new String[] {"VISA", "MasterCard", "PromptPay"};
    }
}
