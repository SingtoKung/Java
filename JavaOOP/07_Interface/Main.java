public class Main {
    public static void main(String[] args) {
        IronMan h1 = new IronMan();
        h1.setName("IronMan");
        h1.setAge("30");
        h1.displayHero();
        h1.skill("Shooting");

        System.out.println("----------------------------------");

        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("35");
        h2.displayHero();
        h2.skill("ATK");
        h2.weapon("Hammer");
        h2.setNation("US");
    }
}
