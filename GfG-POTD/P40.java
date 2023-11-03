// Reverse a String

// You are given a string s. You need to reverse the string.

public class P40 {
    public static void main(String[] args) {
        String s = "Geeks";
        String ans = reverseWord(s);
        System.out.println(ans);
    }

    public static String reverseWord(String str) {
        // Reverse the string str

        String ans = "";

        for(int i=str.length()-1; i>=0; i--){
            ans = ans + str.charAt(i);
        }

        return ans;
    }
}
