public class String01 {
    public static void main(String[] args) {
    /*
     * Crate Object by Class
     * Concatenation
     * Find string length --> return integer
     * Find char index of string (charAt) 
     * Compare string (equals & equalsIgnorecase)
     * Find start word (startsWith)
     * Find end word (endsWith)
     * Find word index of string (IndexOf)
     */

        // Crate Object by Class
        String name = "Singto kung";
        String name2 = "Suwa In";
        String name3 = "Singto Kung";
        String city = new String("Bangkok, Thailand");

        // Concatenation
        String result = name + city;
        System.out.println(name + city);
        System.out.println("Result: " + result);
        System.out.println("Result with concat .com: " + result.concat(".com"));
        System.out.println();

        // Find string length
        System.out.println("Length of " + name + ": " + name.length());
        System.out.println();

        // Find char index of string (charAt)
        int index = 2;
        System.out.println("Index " + index + " = " + name.charAt(index));
        System.out.println();

        // Compare string (equals & equalsIgnorecase)
        boolean result1 = name.equals(name3);
        System.out.println("Compare equals " + name + " with " + name3 + " = " + result1);
        boolean result2 = name.equalsIgnoreCase(name3);
        System.out.println("Compare equalsIgnorecase " + name + " with " + name3 + " = " + result2);
        System.out.println();

        // Find start word (startsWith)
        String sentence = "Mr Joe Smith";
        Boolean result4 = sentence.startsWith("Mr");
        System.out.println("Start with 'Mr': " + result4);
        System.out.println();

        // Find end word (endsWith)
        Boolean result5 = sentence.endsWith("Smith");
        System.out.println("End with 'Smith': " + result5);
        System.out.println();

        // Find word index of string (IndexOf)
        int ind = 0;
        ind = sentence.indexOf("Joe");
        System.out.println("Index of 'Joe': " + ind);
        System.out.println();
    
    }
}
