abstract class SuperHero {
    
    private String name;
    private String age;
    private String job;
    

    public void setName (String name) {
        this.name = name;
    }
    public void setAge (String age) {
        this.age = age;
    }

    public void displayHero() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    public abstract void skill (String skill);
    
}
