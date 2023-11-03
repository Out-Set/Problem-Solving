public class Program9_FindLCMOfTwoNumbers {
    public static void main(String[] args) {
        int n1 = 2, n2 = 8;
    
        FindLCM c1 = new FindLCM();
        System.out.println(c1.LCM(n1, n2));

        // Using HCF: n1 X n2 = LCM X HCF
        FindLCM.LCMThroughHCF(n1, n2);

        
        
    }
}

class FindLCM {
    int LCM(int n1, int n2) {

        int res = Math.max(n1, n2);
        
        while(true){
            if((res%n1 == 0) && (res%n2 == 0)){
                return res;
            }
            res++;
        }
    }

    // Using HCF: n1 X n2 = LCM X HCF
    static void LCMThroughHCF(int x, int y){
        int LCM1 = (x*y)/FindHCF.HCF1(x, y);
        System.out.println(LCM1);

        int LCM2 = (x*y)/FindHCF.HCF2(x, y);
        System.out.println(LCM2);
    }
}

class FindHCF {
    static int HCF1(int x, int y){
        if(x == y){
            return y;
        }
        
        if(x > y){
            x = x -y;
        }
        else{
            y = y - x;
        }
        
        return HCF1(y, x);
    }

    static int HCF2(int x, int y){
        if (y == 0){
            return x;
        }
        return HCF2(y, x % y);
    }
}
