// Given a number N, the task is to find the largest prime factor of that number.

public class P22 {
    public static void main(String[] args) {
    
        int n = 24;
        long res = largestPrimeFactor(n);
        System.out.println(res);
    }

    static long largestPrimeFactor(int N) {
        
        long i=2;
        
        while(i*i<=N) {

            if(N%i==0) {
                N/=i;
            }
            else {
                i++;
            }
        }
        
        return N;
    }    
}