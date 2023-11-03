package One_Dimensional_DP;

// TC = O(n), SC = O(1)
class D1_Fibonacci {

    static int fib(int n) {
        int prev1 = 1;
        int prev2 = 0;

        if(n==0){
            return prev2;
        }

        if(n==1){
            return prev1;
        }

        for(int i=2; i<=n; i++){
            int curr_i = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr_i;
        }

        return prev1;
    }

    public static void main(String[] args) {
        
        int n = 9;
        for(int i=0; i<=n; i++){
            System.out.println(fib(i));
        }
    } 
}