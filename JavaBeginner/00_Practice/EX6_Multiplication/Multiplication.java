public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <=2; i++) {
            System.out.println("Multiplicand: " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + "\t= " + (i*j));
            }
            System.out.println();
        }
    }
}
