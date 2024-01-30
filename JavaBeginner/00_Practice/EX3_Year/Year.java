import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please in put year (B.E.): ");
        int year = sc.nextInt();

        System.out.println("Year (AD) = " + (year -= 543));
    }
}
