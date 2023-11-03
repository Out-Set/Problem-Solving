import java.util.ArrayList;

public class P32 {
    public static void main(String[] args) {
        int N = 5, S = 12;
        int A[] = {1,2,3,7,5};

        System.out.println(subarraySum(A, N, S));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int ind = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += arr[i];
    
            while (curr > s && ind < i) {
                curr = curr - arr[ind];
                ind++;
            }
            
            if (curr == s) {
                ans.add(ind + 1);
                ans.add(i + 1);
                return ans;
            }
        }
        
        if (ans.size() == 0) {
            ans.add(-1);
        }
        
        return ans;
    }
}
