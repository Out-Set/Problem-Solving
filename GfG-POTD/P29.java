// Nth catalan number

// Given a number N. The task is to find the Nth catalan number.
// The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …

// Catalan Number for N is equal to the number of expressions containing N pairs of paranthesis that are correct matched, 
// i.e., for each of the N '(' there exist N ')' on there right and vice versa.

// Since answer can be huge return answer modulo 1e9+7.

public class P29 {
    public static void main(String[] args) {
        
    }

    public static int findCatalan(int n) {
        // code here
        long[] c = new long[n+1];
        
        int mod = 1000000007;
        c[0] = 1;
        
        for(int i = 1; i<=n; i++){
            for(int j =0; j<i; j++){
                c[i] = (c[i] %mod + ((c[j] % mod) * (c[i-1-j] % mod))%mod) % mod;
            }
        }
        
        return (int)c[n];
    }
}
