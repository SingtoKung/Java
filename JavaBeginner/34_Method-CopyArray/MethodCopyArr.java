public class MethodCopyArr {
    public static void main(String[] args) {
    /*
     * modifier type[] method_name (type[] arr_name) {
     *      คำสั่งต่างๆ
     *      
     *      return []
     * }
     */

        int[] number1 = {10,20,30,40,50};
        int[] number2;

        number2 = copyArr(number1);
        System.out.print("New array = ");
        display(number2);


    }

    static void display(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    static int[] copyArr (int[] arr) {
        int[] newArr = arr;
        return newArr;
    }
}
