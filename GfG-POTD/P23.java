// Longest Common Subsequence

public class P23 {
    public static void main(String[] args) {
        int A = 6, B = 6;
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";

        int res = LCS(A, B, str1, str2);
        System.out.println(res);
    }

    static int LCS(int m, int n, String S1, String S2){
        
        int arr[][] = new int[S1.length() + 1][S2.length() + 1];
        
        
        for(int i=1; i<=S1.length(); i++){
            for(int j=1; j<=S2.length(); j++){
                
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    arr[i][j] = 1 + arr[i-1][j-1];
                }
                else{
                    arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        
        return arr[S1.length()][S2.length()];

    }    
}