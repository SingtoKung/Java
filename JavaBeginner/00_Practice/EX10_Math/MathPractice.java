import java.lang.Math;

public class MathPractice {
    public static void main(String[] args) {
        System.out.println("PI: " + Math.PI);
        System.out.println("log e: " + Math.E);

        int number = -30;
        System.out.println("Number: " + number);
        System.out.println("ABS" + Math.abs(number));

        double dou = 14.5d;
        System.out.println("Number: " + dou);
        // <= .5 ปัดลง
        // > .5 ปัดขึ้น
        System.out.println("rint: " + Math.rint(dou));
        // >= .5 ปัดขึ้น
        // < .5 ปัดลง
        System.out.println("round: " + Math.round(dou));
        System.out.println("Ceil: " + Math.ceil(dou));
        System.out.println("Floor: " + Math.floor(dou));

        System.out.println("Root 2 of " + dou + " " + Math.sqrt(dou));
        System.out.println("Pow 2 of " + dou + " = " + Math.pow(dou, 2));
    }
}
