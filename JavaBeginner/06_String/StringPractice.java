public class StringPractice {
    public static void main(String[] args) {
        /* 
        String = ชนิดข้อมูลที่เก็บชุดข้อความ
        Symbol: ""

        char = ชนิดข้อมูลที่เก็บตัวอักษร
        Symbol: ''
        */ 
        
        char a = 'A';
        String name = "2134";

        // String to integer
        int c;
        c = Integer.parseInt(name) + 1;

        // String to double
        double d;
        d = Double.parseDouble(name) + 2;

        // Integer to string
        String e;
        e = String.valueOf("string: " + name);

        System.out.println(a);
        System.out.println(name);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }    
}
