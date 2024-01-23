public class Main {
    public static void main(String[] args) {
        // Loan johnLoan = new Loan();
        // johnLoan.applicationName = "John";
        // johnLoan.loanAmount = 20000.0d;
        // System.out.println(johnLoan);

        // System.out.println("--------------------------");

        // Loan javaLoan = new Loan();
        // javaLoan.applicationName = "Java";
        // javaLoan.interestRate = 6.0f;
        // System.out.println(javaLoan);
        
        Loan johnLoan = new Loan("John", 20000.0d, 7.5f);
        System.out.println(johnLoan.getInterestRate());
        johnLoan.setInterestRate(9.5f);
        System.out.println(johnLoan.getInterestRate());
        System.out.println("Interest: " + johnLoan.cal());
        // System.out.println(johnLoan); << Can't use this if you use private variable.

        System.out.println("----------------------------");

        Loan jackLoan = new Loan("Jack", 10000.0d, 5.5f);
        // System.out.println(jackLoan);

        System.out.println("----------------------------");

        Loan javaLoan = new Loan("Java");
        System.out.println(javaLoan);
        System.out.println("Interest: " + javaLoan.cal(10000.0d, 7.5f));
    }
    
}