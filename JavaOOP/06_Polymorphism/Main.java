public class Main {
    public static void main(String[] args) {

        // Overloading method
        /* 
        Programmer e1 = new Programmer();
        e1.skill("Java");
        Programmer e2 = new Programmer();
        e2.skill("Python", "JS");
        Programmer e3 = new Programmer();
        e3.skill("Python", "JS", "C++");
        */
    
        // Overiding method
        Programmer e1 = new Programmer();
        e1.bonus();

        Employee e2 = new Employee();
        e2.bonus();
    }
}
