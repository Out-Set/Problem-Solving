package Array;

public class ReverseElement {
    public static void main(String[] args) {
        
        int a[] = new int[]{12, 45, 56, 89, 90};

        int n = a.length;

        int low = 0, high = n-1;

        while(low<high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;

            low++;
            high--;
        }

        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
