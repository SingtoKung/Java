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

        String result;
        if (BMI <= 16) {
            result = "Severe Thinness";
        } else if (BMI <= 17) {
            result = "Moderate Thinness";
        } else if (BMI <= 18.5) {
            result = "Mild Thinness";
        } else if (BMI <= 25) {
            result = "Normal";
        } else if (BMI <= 30) {
            result = "Overweight";
        } else if (BMI <= 35) {
            result = "Obese Class I";
        } else if (BMI <= 40) {
            result = "Obese Class II";
        } else {
            result = "Obese Class III";
        }
        System.out.println();
        System.out.println("BMI classification: " + result);
    }
}
