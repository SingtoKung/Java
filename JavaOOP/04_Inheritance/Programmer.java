public class Programmer extends Employee {

    // Constructor
    public Programmer (String name, Double salary) {
        super(name, salary);
    
        System.out.println("I'm programmer!");
    }
        

    // public Programmer (String name, Double salary) {
    //     setID(id);
    //     setName(name);
    //     setSalary(salary);
    // }
    
    // Method class Programmer
    public void showProgrammer () {
        System.out.println("Programmer Active!");
    }
}
