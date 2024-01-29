public class InDecrement {
    public static void main(String[] args) {
        /*
         * ++a: เพิ่มค่าให้ a ก่อน 1 ค่าแล้วนำไปใช้
         * a++: นำค่าไปใช้ก่อน แล้วค่อยเพิ่มค่าทีหลัง
         * --b: ลดค่าให้ b ก่อน 1 ค่าแล้วนำไปใช้
         * b--: นำค่าไปใช้ก่อน แล้วค่อยลดค่าทีหลัง
         */

         int a = 10;
         int b = 5;
         int c = 7;
         int d = 9;

         System.out.println("++" + a + " = " + (++a));
         System.out.println(b + "++" + " = " + (b++) + " >> " + b);
         System.out.println("--" + c + " = " + (--c));
         System.out.println(d + "--" + " = " + (d--) + " >> " + d);
    }
}
