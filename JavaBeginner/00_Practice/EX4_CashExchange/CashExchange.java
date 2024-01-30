import java.util.Scanner;

public class CashExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of cash to exchange: ");
        int Cash = sc.nextInt();

        int Balance = 0;
        int Grey = 0;
        int Purple = 0;
        int Red = 0;
        int Blue = 0;
        int Green = 0;
        int Baht = 0;

        // แบงค์ 1000
        Grey = Cash / 1000;
        Balance = Cash % 1000;

        // แบงค์ 500
        Purple = Balance / 500;
        Balance = Balance % 500;

        // แบงค์ 100
        Red = Balance / 100;
        Balance = Balance % 100;

        // แบงค์ 50
        Blue = Balance / 50;
        Balance = Balance % 50;

        // แบงค์ 20
        Green = Balance / 20;
        Balance = Balance % 20;

        // เหรียญบาท
        Baht = Balance;

        // Display
        System.out.println("---------Exchanged!!!---------");
        System.out.println("1000 Cash: " + Grey);
        System.out.println("500 Cash: " + Purple);
        System.out.println("100 Cash: " + Red);
        System.out.println("50 Cash: " + Blue);
        System.out.println("20 Cash: " + Green);
        System.out.println("1 Bath coin: " + Baht);
        System.out.println("---------Finished!!!!---------");
    }
}
