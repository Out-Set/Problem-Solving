package String;

public class GCD_2 {
    public static void main(String[] args) {
        
        System.out.println(GCD(12, 15));

        System.out.println(GCD2(12, 15));

        System.out.println(GCD3(12, 15));
    }

    static int GCD(int a, int b){
        int res = Math.min(a, b);

        while(res>0){
            if(a%res==0 && b%res==0){
                return res;
            }
            res--;
        }

        return res;
    }

    static int GCD2(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }

        return b;
    }

    static int GCD3(int a, int b){
        if(b==0){
            return a;
        }
        return GCD3(b, a%b);
    }
}
