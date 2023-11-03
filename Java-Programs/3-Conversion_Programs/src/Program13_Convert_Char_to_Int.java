public class Program13_Convert_Char_to_Int {
    public static void main(String[] args) {
        char ch = '3';
        System.out.println("Char value "+ch);

        // Gives ASCII value of the char
        int charToInt = (int)ch;
        System.out.println("ASCII Value "+charToInt);

        // 1.Converting character to its integer value
        int a1 = ch - '0';
        System.out.println("Int value "+a1);
        
        // 2.Using valueOf() method of String class
        // Converting the character to it's integer value using valueOf() method
        int a2 = Integer.parseInt(String.valueOf(ch));
        System.out.println("Int value "+a2);

        // 3.Using getNumericValue() method of Character Class 
        // Converting the Character to it's int value using getNumericValue() method of Character Class
        int a3 = Character.getNumericValue(ch);
        System.out.println("Int value "+a3);
    }
}

