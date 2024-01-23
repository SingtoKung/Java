public class Loan {
    private String applicantName;
    private double loanAmount;
    private float interestRate;

    public Loan() {

    }

    public Loan(String applicantName) {
        this.applicantName = applicantName;
    }

    // void ไม่จำเป็นต้อง return ค่ากลับไป 
    public static void info() {
        System.out.println("Loan:: static - info()");
        // แต่ static method จะผูกติดกับ class แต่ this.applicantName เป็น object ของ class จะ refer ไม่ได้
        // System.out.println("Loan:: static - info()" + this.applicantName);
    }

    public void show() {
        System.out.println("Loan:: show(): " + this.applicantName);
    }
    
    public String toString() {
        return "Applicant Name: " + applicantName + "\n" + "Loan Amount: " + loanAmount + "\n" + "Interest Rate: " + interestRate;
    }
}
