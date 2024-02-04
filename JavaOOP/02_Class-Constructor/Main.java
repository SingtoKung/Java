public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("01", "KK", 27000.0d); // Create object

        // e1.setID("1");
        // e1.setName("K");
        // e1.setSalary(25000.0d);
        e1.displayEmInfo();
        System.out.println();

        Employee e2 = new Employee("02", "SS", 32000.0d); // Create object

        // e2.setID("2");
        // e2.setName("S");
        // e2.setSalary(27000.0d);
        e2.displayEmInfo();  
        System.out.println();
        
        Employee e3 = new Employee("03", "SS");
        e3.displayEmInfo(); 
        System.out.println();

        Employee e4 = new Employee();
        


    }
}
