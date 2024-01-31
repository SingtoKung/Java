public class LoopArray {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50};

        // For loop
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        String[] fruit = {"Mango", "Orange", "Papaya", "Tomato"};

        // For each
        String sum = "";
        for (String data : fruit) {
            System.out.println(data);
            sum += (data + " ");
        }
        System.out.println(sum);
    }
}
