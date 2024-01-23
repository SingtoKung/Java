import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Launcing", 10000.0d, 7.5f);
        auto.calculateInterest();
        System.out.println(auto.getApplicantName());
        System.out.println(auto);
        System.out.println(Arrays.toString(auto.paymentOptions()));

        System.out.println("-----------------------------------------------------------------");
        Mortgage mortgage = new Mortgage("Mortgage", 20000.0d, 6.5f);
        mortgage.calculateInterest();
        System.out.println(mortgage.getApplicantName());
        System.out.println(mortgage);
        System.out.println(Arrays.toString(mortgage.paymentOptions()));
    }
}
