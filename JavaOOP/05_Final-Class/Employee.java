class Employee {

    // Attribute
    private String id;
    private String name;
    private double salary;

    // Static attribute
    static int minSalary = 12000;

    // Default Constructor
    public Employee () {}
    public Employee (String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee (String name, Double salary) {
        this.name = name;
        this.salary = salary;
        displayEmInfo();
    }

    public void setID (String id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSalary (Double salary) {
        this.salary = salary;
    }

    public String getID () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public Double getSalary () {
        return this.salary;
    }

    public void displayEmInfo () {
        // System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}