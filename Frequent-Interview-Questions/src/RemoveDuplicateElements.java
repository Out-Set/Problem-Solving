public class RemoveDuplicateElements {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{1, 1, 1, 1, 2, 3, 4, 4, 5, 7};

        // removeDuplicateElements1(arr);
    }

    // Important
    
    
    static void removeDuplicateElements1(int arr[]){

        int j = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            else{
                j++;
                arr[j] = arr[i+1];

            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

