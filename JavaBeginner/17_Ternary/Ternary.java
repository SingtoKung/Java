import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        /*
         * variable = (if statement) ? true condition : false condition;
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number (integer): ");
        int number=sc.nextInt();

        // if (number % 2 == 0) {
        //     System.out.println("This number is even.");
        // } else {
        //     System.out.println("This number is odd.");
        // }
        // System.out.println("End process.");

        String result = "";
        result = (number % 2 == 0)?(result = "EVEN"):(result = "ODD");
        System.out.println(result);
    }
}
