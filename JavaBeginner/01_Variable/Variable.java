public class Variable {
    public static void main(String[] args) {
        // Variable แบบไม่ระบุค่าเริ่มต้น
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        // Variable แบบระบุค่าเริ่มต้น
        int number4 = 5;
        boolean isEmpty = true;
        char alp = 'A';
        float number5 = 7.5f; //ถ้าไม่ระบุ .f จะเอา .0 มาต่อท้าย 
        double number6 = 6.4d; //ถ้าไม่ระบุ .d จะเอา .0 มาต่อท้าย

        // Variable แบบหลายบรรทัดในครั้งเดียว
        int a = 0, b = 1, c = 2;

        System.out.println(number4 + number5);

    }
}