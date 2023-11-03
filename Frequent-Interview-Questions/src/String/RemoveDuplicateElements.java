package String;

public class RemoveDuplicateElements {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{1, 1, 1, 1, 2, 3, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8};

        int dups = 0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[dups]){
                for(int j=i; j<arr.length-1; j++){
                    // int temp = arr[j];
                    arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                }
            }
            else{
                dups = i;
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
