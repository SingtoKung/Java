public class Loop {
    public static void main(String[] args) {
        // While loop
        int count = 1;
        while (count <= 2) {
            System.out.println("Hi! " + count + " time.");
            count++;
        }

        // For loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Hello! " + i + " time.");
        }

        // Do...While
        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 2);

        // Loop inside loop (Nested loop)
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }   
}
