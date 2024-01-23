public class Condition {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8};
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n % 2 == 0) {
                System.out.println(n + " is even.");
            } else if (n == 6) {
                System.out.println(n + " is six.");
            } else {
                System.out.println(n + " is odd.");
            }
        }
    }
}