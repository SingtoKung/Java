import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Please input number (if number < 0; end): ");
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
