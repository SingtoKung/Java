import java.util.Scanner;

public class MethodInputReturn {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please input number 1: ");
        int number1 = kb.nextInt();
        System.out.print("Please input number 2: ");
        int number2 = kb.nextInt();

        int maxNum = maxNumber(number1, number2);
        int minNum = minNumber(number1, number2);

        display(maxNum);
        display(minNum);
        
    }
    
    static void display(int result) {
        System.out.println(result);
    }

    static int maxNumber(int a, int b) {
        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    static int minNumber(int a, int b) {
        int min = 0;

        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        return min;
    }
}
