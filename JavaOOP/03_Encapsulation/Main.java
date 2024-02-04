public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("01", "KK", 27000.0d); // Create object;
        e1.displayEmInfo();
        
        System.out.println(Company.name);
        Company.service();
    
    }
}
