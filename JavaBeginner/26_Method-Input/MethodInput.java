public class MethodInput {
    public static void main(String[] args) {
        /*
         * modified void method_name (param1, param2, ...){
         *     กลุ่มคำสั่งต่างๆ
         * }
         * 
         * อาร์กิวเมนต์ = ตัวแปรหรือค่าที่ต้องการส่งมาให้กับเมธอด (ตัวแปรส่ง)
         * พารามิเตอร์ = ตัวแปรที่เมธอดสร้างไว้สำหรับค่าที่จะส่งเข้ามาให้กับเมธอด (ตัวแปรรับ)
         * 
         * การเรียกใช้งาน
         * method_name (argument1, argument2, ...);
         */

         display();
         display2("Hi!"); // "Hi!" >> argument
         fullname("Suwa", "In");
    }

    // Method แบบไม่มีการส่งค่า
    static void display() {
        System.out.println("Hello world");
    }

    // Method - Input type
    static void display2(String message) {
        System.out.println(message); // message >> parameter with variable type
    }

    static void fullname(String fname, String lname) {
        System.out.println("Fullname: " + fname + " " + lname);
    }
}
