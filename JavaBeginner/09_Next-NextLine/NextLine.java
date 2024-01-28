import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input you name: ");
        String name = sc.nextLine(); // อ่านข้อความทั้งบรรทัด
        System.out.println("Your name is " + name);

        System.out.print("Please input you name: ");
        String name2 = sc.next(); // อ่านข้อความก่อนถึง Space
        System.out.println("Your name is " + name2);
    
    }
}
