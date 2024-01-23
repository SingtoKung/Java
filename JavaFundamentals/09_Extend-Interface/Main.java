import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Auto launcing = new Auto("Launcing", 10000.0d, 7.5f);
        System.out.println(launcing.calculateInterest());
        // System.out.println(launcing.getApplicantName());
        System.out.println(Arrays.toString(launcing.paymentOptions()));
        System.out.println(launcing);
    }
}
