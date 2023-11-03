public class Program1_Convert_Binary_to_Octal {
    public static void main(String[] args) throws Exception {

        // Using the built-in toOctalString() method in Java
        UsingToOctalString ob = new UsingToOctalString();
		System.out.println(ob.decimalToOctal(100100));

        // Through Mathemmatical Approach
        BinaryToOctal ob1 = new BinaryToOctal();
        System.out.println(ob1.decimalToOctal(100100));
    }
}

// Using the built-in toOctalString() method in Java
// First convert Binary to Decimal
// Then Decimal to Octal
// Java program to convert binary to octal
class UsingToOctalString {

	int binaryToDecimal(long binary){
		int decimalNumber = 0, i = 0;

		while (binary > 0) {

			decimalNumber += Math.pow(2, i++) * (binary % 10);

			binary /= 10;
		}
		return decimalNumber;
	}

	// function to convert decimal to octal
	int decimalToOctal(long binary){
		int decimalNumber = binaryToDecimal(binary);

		String octalString = Integer.toOctalString(decimalNumber);

		int octalNumber = Integer.parseInt(octalString);

		return octalNumber;
	}
}

// Through Mathemmatical Approach
class BinaryToOctal {

    int decimalToOctal(long binaryNum){

        int octalNumber = 0, i = 0;
        
        UsingToOctalString c1 = new UsingToOctalString();
        int decimalNumber = c1.binaryToDecimal(binaryNum);

        while(decimalNumber !=0){
            octalNumber += (decimalNumber % 8)*((int)Math.pow(10, i++));

            // removing the last digit by dividing by 8
            decimalNumber /= 8;
        }
        return octalNumber;
    }
}