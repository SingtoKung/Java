import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Input by Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number (integer): ");
        int number=sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }
        System.out.println("End process.");
    }
}
