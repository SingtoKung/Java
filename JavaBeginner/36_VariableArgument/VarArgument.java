public class VarArgument {
    public static void main(String[] args) {
    /*
     * modifier type method_name (type...arr) {
     *      คำสั่งต่างๆ
     * }
     */
        int[] number = {1,2,3,4,5,6};
        summation(number); 
    
    }

    public static void summation (int...number) {
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        System.out.println("Sum = " + sum);
    }
}
