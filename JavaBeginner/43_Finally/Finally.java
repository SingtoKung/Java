import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
    /*
     * try {
     *      ลองทำคำสั่งนี้
     * } catch (Exception e) {
     *      ถ้าเกิดข้อผิดพลาดให้มาทำส่วนนี้
     * } finally {
     *      คำสั่งต่างๆ
     * }
     */

     try {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = kb.nextInt();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        System.out.println("Run other command.");
    }
    }
}
