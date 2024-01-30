import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Please input number (if number < 0; end): ");
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }
        System.out.println("Summary = " + sum);
    }
}
