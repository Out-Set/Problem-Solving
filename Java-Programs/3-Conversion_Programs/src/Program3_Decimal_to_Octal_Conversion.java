public class Program3_Decimal_to_Octal_Conversion {
    public static void main(String[] args) {
        
        DecimalToOctal c1 = new DecimalToOctal();
        System.out.println(c1.decimalToOctal(36));
        System.out.println(c1.decimalToOctal(157));
    }
}

class DecimalToOctal {
    int decimalToOctal(int decimalNumber){
        int octalNum = 0, i = 0;
        while(decimalNumber != 0){
            octalNum += (decimalNumber % 8)*((int)Math.pow(10, i++));
            decimalNumber /= 8;
        }
        return octalNum;
    }
}
