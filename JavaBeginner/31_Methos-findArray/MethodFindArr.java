public class MethodFindArr {
    public static void main(String[] args) {
        int[] number = {10,5,4,15,50};
        int result = findMaxIndex(number);
        System.out.println("Max index = " + result);
    }

    static int findMaxIndex (int[] arr) {
        int maxIndex = 0;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
