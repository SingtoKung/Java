public class MethodCompareArr {
    public static void main(String[] args) {
        int[] number1 = {1,3,6,10,45};
        int[] number2 = {1,4,7,10,45};

        System.out.println("Compare reult: " + compareArr(number1, number2) );

    }

    static Boolean compareArr (int[] number1, int[] number2) {
        if (number1.length != number2.length) {
            return false;
        }

        for (int i = 0; i < number1.length; i++) {
            if (number1[i] != number2[i]) {
                return false;
            }
        }
        return true;
    }
}
