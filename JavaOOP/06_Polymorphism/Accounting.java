public class Accounting extends Employee{
    public Accounting () {

    }

    public Accounting (String name, Double salary) {
        super(name, salary);

        System.out.println("I'm accounting.");
        
    }

    // abstract
    public void bonus () {

    }
}
