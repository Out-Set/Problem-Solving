// https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/

public class Program7_CheckIfAGivenIntegerIsOddOrEven {
    public static void main(String[] args) {

        // 1. Using Brute Force
        UsingBruteForce c1 = new UsingBruteForce(5);
        UsingBruteForce c2 = new UsingBruteForce(8);

        // 2. Using Bitwise OR
        UsingBitwiseOR c3 = new UsingBitwiseOR(5);
        UsingBitwiseOR c4 = new UsingBitwiseOR(8);

        // 3. Using Bitwise AND
        UsingBitwiseAND c5 = new UsingBitwiseAND(5);
        UsingBitwiseAND c6 = new UsingBitwiseAND(8);

        // 4. Using Bitwise AND
        UsingBitwiseXOR c7 = new UsingBitwiseXOR(5);
        UsingBitwiseXOR c8 = new UsingBitwiseXOR(8);

        // 5. Using LSB(Least Significant Bit)
        UsingLSB c9 = new UsingLSB(5);
        UsingLSB c10 = new UsingLSB(8);
    }
}

class UsingBruteForce{
    UsingBruteForce(int num){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// i.e. 2 OR 1: 10|01 = 11 = 3(>num) and 3 OR 1 = 11|01 = 11 = 3(=num)
class UsingBitwiseOR {
    UsingBitwiseOR(int num){
        if((num | 1) > num)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// i.e. 2 AND 1: 10&01 = 00 = 0(=0) and 3 AND 1 = 11 & 01 = 01 = 1(=1)
class UsingBitwiseAND {
    UsingBitwiseAND(int num) {
        if((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// XOR: 1 if relative bits are different else 0.
// i.e. 2 XOR 1: 10^01 = 11 = 3(=num+1) and 3 XOR 1 = 11^01 = 01 = 2(=num-1)
class UsingBitwiseXOR {
    UsingBitwiseXOR(int num) {
        if((num^1) == num+1)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

// LSB(Least Significant Bit): 0 for even and 1 for odd.
class UsingLSB {
    UsingLSB(int num) {
        if (num != 0) {
            if (Integer.toBinaryString(num).endsWith("0"))
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
 
        // Here we will land if it does not ends with 0
        else {
            System.out.println("Entered num is Zero.");
        }
    }
}
