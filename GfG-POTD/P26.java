// Nth Fibonacci Number, under Modulo 1000000007: 10^9+7

public class P26 {
    public static void main(String[] args) {
        
        int n = 14521;
        int res = nthFibonacci(n);
        System.out.println(res);
    }

    static int nthFibonacci(int n){
        // code here
        if(n==0) return 0;
        
        int a=0;
        int b=1;
        
        // Modulo 1000000007: 10^9+7
        int mod=(int)1e9+7;
        
        n-=2;
        while(n-->=0) {
            int c=(a%mod+b%mod)%mod;
            a=b;
            b=c;
        }
        
        return b;
    }
}
