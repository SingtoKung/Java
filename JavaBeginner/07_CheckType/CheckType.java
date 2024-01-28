public class CheckType {
    public static void main(String[] args) {
        Integer a = 1;
        double b = 2;
        String c = "Hello";
        boolean d = true;
        char e = 'A';
        float f = 3;


        // Check type: True or False
        // instanceof ใช้กับ Class เท่านั้น
        boolean result = c instanceof String;
        System.out.println(result);

    }
}
