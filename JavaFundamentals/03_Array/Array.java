public class Array {
    public static void main(String[] args) {
        String[] names = {"Singto", "Kung", "insuwa"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        names[0] = "Super" + names[0];

        System.out.println(names[0]);

        int[] numbers = {4, 5, 6, 7};
        System.out.println("length: " + numbers.length);
    }
}
