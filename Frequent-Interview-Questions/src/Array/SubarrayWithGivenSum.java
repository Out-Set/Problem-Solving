package Array;

// Sub Array With Given Sum in sorted array
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        
        int a[] = new int[]{1, 2, 3, 5, 6, 12};
        System.out.println(subarrayWithGivenSum(a, 8));
        System.out.println(subarrayWithGivenSum(a, 11));
    }

    static int subarrayWithGivenSum(int a[], int givenSum){

        for(int i=0; i<a.length; i++){
            int sum = a[i];

            for(int j=i+1; j<a.length; j++){
                sum = sum + a[j];
                if(sum == givenSum){
                    System.out.println("Form "+i+" to "+j);
                    return 1;
                }
            }            
        }
        return 0;
    }
}
