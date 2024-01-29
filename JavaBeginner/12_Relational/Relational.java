
import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int a = sc.nextInt();

        System.out.print("Input number 2: ");
        int b = sc.nextInt();
        
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than ot equal to: " + (a <= b));

    }
}
