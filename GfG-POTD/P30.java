import java.util.Vector;

// Next Smallest Palindrome

// Given a number, in the form of an array Num[] of size N containing digits from 1 to 9(inclusive). 
// The task is to find the next smallest palindrome strictly larger than the given number.
public class P30 {
    public static void main(String[] args) {
        
        int Num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        int n = Num.length;
        Vector<Integer> v = generateNextPalindrome(Num, n);
        System.out.println(v);        
    }

    static void generateNextPalindromeUtil(int num[], int n) {
        int mid = n / 2;

        int i = mid - 1;

        int j = (n % 2 == 0) ? mid : mid + 1;

        boolean leftsmaller = false;

        while (i >= 0 && num[i] == num[j]) {
            i--;
            j++;
        }

        if (i < 0 || num[i] < num[j]) {
            leftsmaller = true;
        }

        while (i >= 0) {
            num[j++] = num[i--];
        }

        if (leftsmaller) {
            int carry = 1;

            if (n % 2 == 1) {
                num[mid] += 1;
                carry = num[mid] / 10;
                num[mid] %= 10;
            }
            i = mid - 1;
            j = (n % 2 == 0 ? mid : mid + 1);

            while (i >= 0 && carry > 0) {
                num[i] = num[i] + carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j] = num[i]; // copy mirror to right
                i--;
                j++;
            }
        }
    }
    
    static Vector<Integer> generateNextPalindrome(int num[], int n) {
        Vector<Integer> ans = new Vector<>(); 
        
        if (isAll9(num, n)) {
            ans.add(1);
            for (int i = 0; i < n - 1; i++) ans.add(0);
            ans.add(1);

        }

        // Input type 2 and 3
        else {
            generateNextPalindromeUtil(num, n);
            for (int i = 0; i < n; i++) {
                ans.add(num[i]);
            }
        }
        return ans;
    }

    // A utility function to check if num has all 9s
    static boolean isAll9(int num[], int n) {
        for (int i = 0; i < n; i++)
            if (num[i] != 9) return false;
        return true;
    }
}
