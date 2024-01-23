public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan("Loan");
        loan.show();
        // ใช้ class name ได้เลย
        Loan.info();

        Main.infoMain();
    }

    public static void infoMain() {
        System.out.println("Main:: static - info()");
    }
}
