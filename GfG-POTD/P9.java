// Heap Sort

public class P9 {
    public static void main(String[] args) {

        int arr[] = {4, 1, 3, 9, 7};
        int n = arr.length;
        
        heapSort(arr, n);

        for (int i : arr) {
            System.out.println(i);
        }
        
    }

    static void heapSort(int arr[], int n) {
        // Your code here
        for(int i=n-2/2; i>=0; i--){
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {  
            int temp = arr[0];  
            arr[0] = arr[i];  
            arr[i] = temp;  
              
            heapify(arr, i, 0);  
        }    
    }

    static void heapify(int arr[], int n, int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;

        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }

        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }

        if(largest != i){
            // Swap(arr[i],arr[largest])
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;

            // Recursively call minHeapify() for that smallest
            heapify(arr, n, largest);
        }
    }

}
