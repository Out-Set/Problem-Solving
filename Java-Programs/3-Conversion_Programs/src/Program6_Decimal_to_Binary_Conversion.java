public class Program6_Decimal_to_Binary_Conversion {
    public static void main(String[] args) {
        
        DecimalToBinary.decToBinary(10);
        DecimalToBinary.decToBinary(33);
    }
}

class DecimalToBinary {
    static void decToBinary(int decNumber){
        String binNumber = "";

        while(decNumber != 0){
            int rem = decNumber % 2;
            binNumber += rem;
            decNumber = decNumber/2;
        }

        StringBuilder sb = new StringBuilder(binNumber);
        System.out.println(sb.reverse());
    }
}