import java.util.ArrayList;
import java.util.Collections;

// Leaders in an array

class P31{
    public static void main(String[] args) {
        int n = 6;
        int A[] = {16,17,4,3,5,2};

        ArrayList<Integer> res = leaders(A, n);
        System.out.println(res);

    }


    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        int leader = arr[n-1];
        al.add(leader);

        for(int i=n-2; i>=0; i--){
            if(arr[i] >= leader){
                leader = arr[i];
                al.add(leader);
            }
        }

        Collections.reverse(al);
        return al;        
    }
}