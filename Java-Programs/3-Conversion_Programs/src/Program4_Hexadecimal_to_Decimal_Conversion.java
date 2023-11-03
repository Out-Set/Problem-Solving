public class Program4_Hexadecimal_to_Decimal_Conversion {
    public static void main(String[] args) {
        
        System.out.println(HexadecimalToDecimal.hexToDecimal("1AB"));
    }
}

class HexadecimalToDecimal {
    static int hexToDecimal(String hexVal) { 
		int len = hexVal.length(); 
        
		int base = 1; 
		int dec_val = 0; 

		for (int i = len - 1; i >= 0; i--) { 

			if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') {
                dec_val += (hexVal.charAt(i) - 48) * base; 

				base = base * 16;
			} 
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') { 
				dec_val += (hexVal.charAt(i) - 55) * base;

				base = base * 16;
			} 
		} 
		return dec_val; 
	} 
}
