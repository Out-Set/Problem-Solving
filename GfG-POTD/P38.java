// Palindrome String

// Given a string S, check if it is palindrome or not.

class P38{
    public static void main(String[] args) {
        
        String S = "madama";
        int res = isPalindrome(S);
        System.out.println(res);
    }

    static int isPalindrome(String S) {
        // code here
        
        int start = 0;
        int end = S.length()-1;
        
        while(start < end){
            if(S.charAt(start)!=S.charAt(end)){
                return 0;
            }

            start++;
            end--;
        }

        return 1;
    }
}
