import java.util.Scanner;

public class MethodReturn {
    public static void main(String[] args) {
    /*
     * modifier type method_name() {
     *  return ค่าที่จะส่งออกไป(type)
     * }
     */
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter salary: ");
        double salary = kb.nextDouble();

        double bounus = getBonus();

        display(salary, bounus);

        
    }
    static void display(Double salary, Double bonus) {
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }

    static Double getBonus() {
        return 1000.0; 
    }
}
