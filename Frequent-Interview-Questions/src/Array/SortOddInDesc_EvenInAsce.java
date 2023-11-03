package Array;

// Make all odd numbers negative.
// Sort the numbers
// Revert the changes made in the step 1 to get the final result.
public class SortOddInDesc_EvenInAsce {
    public static void main(String[] args) {
        
        int a[] = new int[]{12, 3, 34, 2, 5, 1, 6};

        // Make all odd numbers negative.
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                a[i] = -a[i];
            }
        }

        // Sort the numbers
        sort(a);

        // Revert the changes made in the step 1 to get the final result.
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                a[i] = -a[i];
            }
        }

        // Priniting the final result
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }

    }

    static void sort(int a[]){
        for(int i=1; i<a.length; i++){
            int key = a[i];

            int j = i-1;

            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}
