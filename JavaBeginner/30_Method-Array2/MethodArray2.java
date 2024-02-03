public class MethodArray2 {
    public static void main(String[] args) {
    /*
     * modifier type method_name (type[] arr_name) {
     *      คำสั่งต่างๆ
     * }
     */

        int[] number = {10,15,5,6,100};
        int result = maxNumber(number);
        display(result);
        int result2 = minNumber(number);
        display(result2);

    }

    static void display (int result) {
        System.out.println("Result = " + result);
    }

    static int maxNumber (int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int minNumber (int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
