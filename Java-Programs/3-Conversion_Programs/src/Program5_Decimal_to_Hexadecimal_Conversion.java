public class Program5_Decimal_to_Hexadecimal_Conversion {
    public static void main(String[] args) {
        
        DecimalToHexadecimal.decToHex(427);
    }
}

class DecimalToHexadecimal {
    static void decToHex(int decNumber){
        String hexDecNum = "";

        while(decNumber != 0){
            int rem = decNumber%16;

            if(rem >= 0 && rem <= 9){
                hexDecNum += rem;
            }

            if(rem >= 10 && rem <= 15){
                // ASCII: A To Z = 65 to 91
                hexDecNum += (char)(55 + rem);
            }
            
            decNumber = decNumber/16;
        }

        StringBuilder sb = new StringBuilder(hexDecNum);
        System.out.println("Hexa-Decimal will be: "+sb.reverse());
    }
}