public class TypeCasting {
    public static void main(String[] args) {
        // Widening casting (Auto)
        // Small bits to Large bits
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numDouble);

        // Narrowing casting (Manual)
        // Large bits to Small bits
        double numDouble2 = 10.0d;
        int numInt2 = (int)numDouble2;
        System.out.println(numInt2);

    }
}
