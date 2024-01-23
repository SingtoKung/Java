public class Main {
    public static void main(String[] args) {
        // Mortgage mortgage = new Mortgage("Mortgage", 10000.0d, 7.5f);
        Loan mortgage = new Mortgage("Mortgage", 10000.0d, 7.5f);
        System.out.println(mortgage);
        double rate = mortgage.calculateInterest();
        System.out.println("Interest: " + rate);
        
        System.out.println("----------------------------------------");
        Auto auto = new Auto("Auto", 20000.0d, 6.5f);
        System.out.println(mortgage);
        double rate2 = auto.calculateInterest();
        System.out.println("Interest: " + rate2);
    }
}
