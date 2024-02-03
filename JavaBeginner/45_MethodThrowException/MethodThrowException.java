import java.util.Scanner;

public class MethodThrowException {
    public static void main(String[] args) {
        try {
            int balance = 5000;
            Scanner kb = new Scanner(System.in);
            System.out.print("Input amount of cash to withdraw: ");
            int money = kb.nextInt();
            
            withDraw(money, balance);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void withDraw (int amount, int balance) throws Exception {
        if (amount <= 0) {
            throw new Exception("Please input cash more than 0");
        }
        if (amount > balance) {
            throw new Exception("Remaining cash is not enough.");
        }

        balance -= amount;
        System.out.println("Withdraw = " + amount);
        System.out.println("Balance = " + balance);
    }
}