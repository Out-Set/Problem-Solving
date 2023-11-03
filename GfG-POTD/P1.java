// Longest Palindromic SubSequence

public class P1 {
    public static void main(String[] args) {
        
        String str = "bbbab";
        System.out.println(longestPalinSubseq(str));
    }

    static int longestPalinSubseq(String S) {
        
        String R = new StringBuilder(S).reverse().toString();
        
        int arr[][] = new int[S.length() + 1][R.length() + 1];
        
        
        for(int i=1; i<=S.length(); i++){
            for(int j=1; j<=R.length(); j++){
                
                if(S.charAt(i-1) == R.charAt(j-1)){
                    arr[i][j] = 1 + arr[i-1][j-1];
                }
                else{
                    arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        
        return arr[S.length()][R.length()];
    }
}
