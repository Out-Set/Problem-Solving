public class Program13_CheckArmstrongNumberBetweenARange {
    public static void main(String[] args){

        ArmstrongNumber.isArmStrong(100, 500); 
        
    }    
}

class ArmstrongNumber{
    static void isArmStrong(int from, int upto){

        for(int num=from; num<=upto; num++){

            int init = num;
            int N = 0;

            // Calculate number of digits
            while(init != 0){
                N++;
                init = init / 10;
            }

            init = num;
            int sum = 0;

            while(init != 0){
                int R = init % 10;
                sum += Math.pow(R, N);
                init = init / 10;
            }

            if(num == sum){
                System.out.println(sum);
            }
        }
    }
}