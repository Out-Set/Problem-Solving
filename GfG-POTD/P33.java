// Number of occurrence

// Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

public class P33 {
    public static void main(String[] args) {
        int N = 7, X = 2;
        int Arr[] = {1, 1, 2, 2, 2, 2, 3};

        int res = count(Arr, N, X);
        System.out.println(res);
    }

    static int count(int[] arr, int n, int x) {
        // code here

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                count++;
            }
        }

        return count;
    }
}
