public class GlobLoc {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(a);
        
        {
            int c = 3;
            System.out.println(c);
            System.out.println(a);
        }

        System.out.println(b);
    }
}
