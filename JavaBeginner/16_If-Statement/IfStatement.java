import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        String result;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number: ");
        int number1 = sc.nextInt();

        
        if (number1 <= 15) {
            result = "Children";
        } else if (number1 > 15 && number1 <= 20) {
            result = "Teen";
        } else if (number1 > 20 && number1 <= 30) {
            result = "Adult";
        } else {
            if (number1 < 80) {
                result = "Someone";
            }
            else {
                result = "Not found!";
            }
        }

        System.out.println("Result: " + result);
    }
}
