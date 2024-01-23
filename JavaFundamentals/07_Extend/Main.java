public class Main {
    public static void main(String[] args) {
        Loan john = new Loan("John", 20000.0d, 8.5f);
        john.calculateInterest();
        System.out.println(john);
        
        System.out.println("-------------------------------");
        Auto launcing = new Auto("Launcing", 10000.0d, 7.5f);
        launcing.calculateInterest();
        System.out.println(launcing);

        System.out.println("-------------------------------");
        Mortgage mortgage = new Mortgage("Mortgage", 10000.0d, 7.5f);
        mortgage.calculateInterest();
        System.out.println(mortgage);
    }
}
