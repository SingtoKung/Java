import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input hight (cm.): ");
        double hight = sc.nextDouble();

        System.out.print("Please input weight (kg.): ");
        double weight = sc.nextDouble();

        hight /= 100;
        double BMI = weight / (hight * hight);
        System.out.println("--------------------------");
        System.out.print("Your BMI is ");
        System.out.printf("%,.2f", BMI);
    }
}
