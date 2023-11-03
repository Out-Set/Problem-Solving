public class Program14_CheckIfaNumberIsNeonNumberOrNot {
    public static void main(String[] args) {
        
        NeonNumber.isNeon(9);
        NeonNumber.isNeon(8);
    }
}

// Given number 9 is Neon number, Explanation : square of 9=9*9=81 then sum of square 8+1=9(initial number)
class NeonNumber {
    static void isNeon(int num){
        int sq = num*num;
        int sum = 0;

        while(sq != 0){
            sum = sum + sq%10;
            sq = sq/10;
        }

        if(sum == num){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}