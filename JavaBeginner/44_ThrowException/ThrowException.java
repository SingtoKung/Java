import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        /*
         * if (age <= 20) {
         * throw new ArithmeticException("ERROR!");
         * }
         */

        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Input number: ");
            int num = kb.nextInt();
            if (num < 0) {
                throw new Exception("Please input number >= 0");
            }
            System.out.println(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
