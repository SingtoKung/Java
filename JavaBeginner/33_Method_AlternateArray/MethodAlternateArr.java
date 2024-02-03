public class MethodAlternateArr {
    public static void main(String[] args) {
        int[] number = {10,30,45,3,7};

        System.out.print("Main arr = ");
        display(number);    
        System.out.println();
        swapElement(number, 4, 0);
        System.out.print("Swap arr = ");
        display(number);
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

    static void swapElement (int[] arr, int from, int  to) {
        int tempValue = arr[to];

        arr[to] = arr[from];
        arr[from] = tempValue;
    }
}
