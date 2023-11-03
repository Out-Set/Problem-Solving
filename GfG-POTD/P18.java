import java.util.ArrayList;
import java.util.Collections;

// Chocolate Distribution Problem

class P18{
    public static void main(String[] args) {
        int n = 8, m = 5;
        int []arr = new int[]{3, 4, 1, 9, 56, 7, 9, 12};

        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            al.add(arr[i]);
        }
        
        long res = findMinDiff(al, n, m);

        System.out.println(res);
    }

    static long findMinDiff (ArrayList<Integer> a, int n, int m){
        // your code here
        
        Collections.sort(a);
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++)
        {
            ans=Math.min(ans,a.get(i+m-1)-a.get(i));
        }
        
        return ans;
    }
}