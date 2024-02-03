public class String02 {
    public static void main(String[] args) {
    /*
     * Replace string (replace, replaceFirst)
     * Split string (split)
     * Find sub string (subString)
     * Convert String to Character 
     * Convert Character to String
     * Delete space from string
     * Convert between UpperCase - LowerCase
     * Convert Integer, Float, Double to String (valueOf)
     */
        String name = "Singto kung";
        String message = "Happy mak mak 2023 | 2023";
        String message2 = " _Hello_ ";

        // Replace string (replace, replaceFirst)
        System.out.println("Replace string (replace, replaceFirst)");
        System.out.println("- Replace 2023 to 2024: " + message.replace("2023", "2024"));
        System.out.println("- ReplaceFirst 2023 to 2024: " + message.replaceFirst("2023", "2024"));
        System.out.println();

        // Split string (split)
        System.out.println("Split string (split)");
        String[] result = name.split(" ");
        System.out.println("- Split string: " + name);
        System.out.println("- Split 1: " + result[0]);
        System.out.println("- Split 2: " + result[1]);
        System.out.println();

        // Find sub string (subString)
        System.out.println("Find sub string (subString)");
        // subString(beginIndex, endIndex);
        System.out.println(message.substring(0, message.length()-7));
        System.out.println();

        // Convert String to Character 
        System.out.println("Convert String to Character ");
        char[] alp = name.toCharArray();
        int index = 0;
        System.out.println("- String: " + name);
        System.out.println("- Index " + index + " = " + alp[0]);
        System.out.println();

        // Convert Character to String
        System.out.println("Convert Character to String");
        char[] name1 = {'S', 'i', 'n', 'g', 't', 'o'};
        System.out.println("- String is " + String.copyValueOf(name1));
        System.out.println();

        // Delete space from string
        System.out.println("Delete space from string");
        System.out.println("- Message: " + message2 + ", Length: " + message2.length());
        message2 = message2.trim();
        System.out.println("- After: " + message2 + ", Length: " + message2.length());
        System.out.println();

        // Convert between UpperCase - LowerCase
        System.out.println("Convert between UpperCase - LowerCase");
        System.out.println("- UpperCase: " + name.toUpperCase());
        System.out.println("- LowerCase: " + name.toLowerCase());
        System.out.println();

        // Convert Integer, Float, Double to String (valueOf)
        System.out.println("Convert Integer, Float, Double to String (valueOf)");
        int num1 = 100;
        float num2 = 99.9f;
        double num3 = 2222.2d;
        String result1 = String.valueOf(num1);
        String result2 = String.valueOf(num2);
        String result3 = String.valueOf(num3);
        System.out.println("- Convert int: " + result1);
        System.out.println("- Convert float: " + result2);
        System.out.println("- Convert double: " + result3);
        System.out.println();
    }
}
