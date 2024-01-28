import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        // Input data type: int, float, long, double
        

        // Input data type: string
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = sc.nextLine(); // รับค่า String จากแป้นพิมพ์

        System.out.print("Input your birth year: ");
        int year = sc.nextInt(); // รับค่า int จากแป้นพิมพ์

        System.out.print("Input your hight: ");
        float h = sc.nextFloat(); // รับค่า float จากแป้นพิมพ์

        int age = 2024 - year;

        System.out.println("Your name is " + name + ".");
        System.out.println("Your birth year is " + year + ".");
        System.out.println("Your age is " + age + ".");
        System.out.println("Your hight is " + h + ".");
    }
}
