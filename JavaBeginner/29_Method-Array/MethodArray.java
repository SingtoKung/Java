public class MethodArray {
    public static void main(String[] args) {
    /*
     * modifier void method_name (type[] arr) {
     *      คำสั่งต่างๆ
     * }
     */

        int[] number = {10,20,30,40};
        displayArr(number);
    }

    static void displayArr(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Number " + (i+1) + ": " + number[i]);
        }
    }
}
