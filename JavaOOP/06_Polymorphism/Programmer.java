public class Programmer extends Employee {

    // overloading method
    public void skill () {
        System.out.println("No skill");
    }

    public void skill (String language) {
        System.out.println("Programming language: " + language);
    }

    public void skill (String language1, String language2) {
        System.out.println("Programming language 1: " + language1);
        System.out.println("Programming language 2: " + language2);
    }

    public void skill (String...arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Skill " + (i+1) + ": " + arr[i]);
        }
    }

    // Overiding method
    public void bonus () {
        System.out.println("Bonus = 30%" );
    }
}
