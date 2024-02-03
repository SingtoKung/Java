import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
    /*
     * Example exception:
     * - ArrayIndexOutOfBoundsException
     * - ArithmeticException
     * - ZeroDivisionException
     * - IOException
     * - FileNotFoundException
     * - Etc.
     */

    /*
     * try {
     *      ลองทำคำสั่งในนี้
     * } catch(Exception e) {
     *      ถ้าเกิดข้อผิดพลาดจะมาทำตรงนี้
     * }
     */

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0 (zero)");
        }

        try {
            int[] item = {10,20,30,40};
            System.out.println(item[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't print");
        }

        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter number : ");
            int num = kb.nextInt();
        } catch (Exception e) {
            System.out.println("Can input only integer");
            e.printStackTrace();
        }
        
        
    }
}
