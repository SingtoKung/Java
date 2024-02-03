public class BasicMethod {
    public static void main(String[] args) {
        /*
         * type name (param1, param2, ...) {
         *  statements
         * }
         * 
         * access_modifier type name (param1, param2, ...) {
         *  statements
         * }
         */

            display();
            plus();
        } 
    static void display() {
        System.out.println("Hello world!");
    }
    static void plus() {
        int a = 10;
        int b = 5;
        System.out.println(a+b);
    }
}