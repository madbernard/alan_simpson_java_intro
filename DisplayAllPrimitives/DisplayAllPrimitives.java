
public class DisplayAllPrimitives {
    public static void main (String[] args) {
        System.out.println(33); // Int
        System.out.println(339922001144556677L); // Long
        System.out.println('a'); // Char
        System.out.println(33.0897); // Double
        System.out.println(450.37F); // Float
        System.out.println(true); // Boolean
        System.out.println(0b00010); // Binary
        System.out.println(0xab1e); // Hex
        System.out.println("String\nFTW\n\n...now to print variables"); // String
        
        int firstInt = 44;
        String firstString = "this string is in a variable";
        boolean firstBool = false;
        final int MAGIC_NUMBER = 7;
        
        System.out.println(firstInt);
        System.out.println(firstString);
        System.out.println(firstBool);
        System.out.println(MAGIC_NUMBER);
    }
}
