public class CharacterMethod {
    public static void main(String[] args) {
    /*
     * สร้าง Object Character ด้วย Class
     * เช็ครูปแบบตัวอักษรด้วย isletter, isDigit
     * isUpperCase, isLowerCase
     * toUpperCase, toLowerCase
     */

        char alphabet = 'C';
        char alphabet2 = 'd';
        char[] group = {'A', 'b', 'C'};

        // สร้าง Object Character ด้วย Class
        @SuppressWarnings("removal")
        Character alpCharacter = new Character('1');

        // เช็ครูปแบบตัวอักษรด้วย isletter, isDigit
        System.out.println(alpCharacter + " isLetter " + Character.isLetter(alpCharacter));
        System.out.println(alpCharacter + " isDigit " + Character.isDigit(alpCharacter));

        // isUpperCase, isLowerCase
        System.out.println(alphabet + " isUpperCase " + Character.isUpperCase(alphabet));
        System.out.println(alphabet + " isLowerCase " + Character.isLowerCase(alphabet));
    
        // toUpperCase, toLowerCase
        System.out.println(alphabet2 + " toUpperCase " + Character.toUpperCase(alphabet2));
        System.out.println(alphabet + " toLowerCase " + Character.toLowerCase(alphabet));
    }

    
}
