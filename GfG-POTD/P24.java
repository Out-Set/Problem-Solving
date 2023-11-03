// Coin Change

public class P24 {
    public static void main(String[] args) {
        
        int N =3;
        int sum = 4;
        int[] coins = {1, 2, 3};

        // Output: 4
        // Explanation: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.

        long res = count(coins, N, sum);
        System.out.println(res);
    }

    static long count(int coins[], int N, int sum) {
        
        long[][] dp=new long[N+1][sum+1];
        
        for(int i=N;i>=0;i--) {
            for(int j=sum;j>=0;j--) {
                if(i==N){
                    dp[i][j]=0;
                }
                else if(j==sum){
                    dp[i][j]=1;
                }
                else {
                    if(j+coins[i]>sum) {
                        dp[i][j]=(i+1<=N)?dp[i+1][j]:0;
                    }
                    else {
                        dp[i][j]=(i+1<=N?dp[i+1][j]:0) + (dp[i][j+coins[i]]);
                    }
                }
            }
        }
        
        return dp[0][0];
    }
}
