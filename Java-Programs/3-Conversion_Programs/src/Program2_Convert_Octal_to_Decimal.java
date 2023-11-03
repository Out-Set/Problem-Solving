public class Program2_Convert_Octal_to_Decimal {
    public static void main(String[] args) {
        
        // Using Integer.parseInt() method
        UsingParseInt c1 = new UsingParseInt();
        c1.octalToDecimal("44");
        c1.octalToDecimal("157");

        // Throught Mathematical Approach
        OctalToDecimal c2 = new OctalToDecimal();
        System.out.println(c2.octalToDecimal(44));
        System.out.println(c2.octalToDecimal(157));
    }
}

// Using Integer.parseInt() method
// To convert any string form to decimal, we can use type.parseType() method.
class UsingParseInt {
    void octalToDecimal(String octString){
        int decimalNumber = Integer.parseInt(octString, 8);
        System.out.println(decimalNumber);
    }
}

// Throught Mathematical Approach
class OctalToDecimal {
    int octalToDecimal(long octalNum){

        int decimalNumber = 0, i = 0;
        while(octalNum > 0){
            decimalNumber += Math.pow(8, i++)*(octalNum % 10);
            octalNum /= 10;
        }
        return decimalNumber;
    }
}


