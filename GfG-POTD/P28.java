// Flip Bits

// Given an array A[] consisting of 0’s and 1’s. A flip operation is one in which you turn 1 into 0 and a 0 into 1. 
// You have to do at most one “Flip” operation of any subarray. Formally, select a range (l, r) in the array A[], 
// such that (0 ≤ l ≤ r < n) holds and flip the elements in this range to get the maximum ones in the final array. 
// You can possibly make zero operations to get the answer.

public class P28 {
    public static void main(String[] args) {
        int N = 5;
        int A[] = {1, 0, 0, 1, 0};
        
        int res = maxOnes(A, N);
        System.out.println(res);
    }

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int ans = 0;
        int zero = 0;
        int one = 0;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zero++;
            } else {
                zero--;
                one++;
            }
            
            ans = Math.max(zero, ans);
            
            if (zero < 0) {
                zero = 0;
            }
        }
        return ans + one;
    }
}
