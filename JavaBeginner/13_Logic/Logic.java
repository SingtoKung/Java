public class Logic {
 public static void main(String[] args) {
    /* AND(&&), OR(||), NOT(!) */

    int a = 10;
    int b = 2;
    int c = 4;

    System.out.println("Result (" + a + " > " + b + ") && (" + a + " > " + c + "): " + ((a > b) && (a > c)));
    System.out.println("Result (" + a + " > " + b + ") || (" + a + " > " + c + "): " + ((a > b) || (a > c)));
 }   
}
