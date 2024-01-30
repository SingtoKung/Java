import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter temperature (celcius): ");
        double temp = sc.nextDouble();

        System.out.println("Celcius = " + temp);
        System.out.println("Fahrenhiet = " + ((temp * 9 / 5) + 32));
        System.out.println("Kelvin = " + (temp + 273.15));
    }
}
