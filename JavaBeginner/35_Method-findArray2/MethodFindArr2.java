public class MethodFindArr2 {
    public static void main(String[] args) {
        int[] number1 = {10,20,30,40,50};
        int findNum = 20;

        int result = searchElement(number1, findNum);
        System.out.print("Array: ");
        display(number1);
        System.out.println();
        System.out.println("Find number = " + findNum);
        System.out.print("Index result = " + result);
        
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

    static int searchElement (int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }
}
