public class Program10_FindGCDorHCFofTwoNumbers {
    public static void main(String[] args) {
        int n1 = 2, n2 = 8;

        int gcd1 = FindGCD.GCD1(n1, n2);
        System.out.println(gcd1);


        int gcd2 = FindGCD.GCD2(n1, n2);
        System.out.println(gcd2);
    }
}

class FindGCD {
    static int GCD1(int x, int y){

        if(x == 0){
            return x;
        } 
        
        if(y == 0){
            return y;
        }

        if(x == y){
            return y;
        }

        if(x > y){
            x = x - y;
        }

        else{
            y = y - x;
        }

        return GCD1(x ,y);
    }

    static int GCD2(int x, int y){
        if(y == 0){
            return x;
        }

        return GCD2(y, x % y);
    }
}