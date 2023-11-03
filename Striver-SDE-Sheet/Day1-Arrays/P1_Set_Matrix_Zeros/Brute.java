package P1_Set_Matrix_Zeros;

class Brute {
    public static void main(String[] args) {
        
        int arr[][] = new int[][]{{1, 1, 1, 0, 1},                                 
                                  {1, 0, 1, 1, 1},
                                  {1, 1, 1, 1, 1},
                                  {1, 1, 1, 1, 1}};

        //  Logic:
        // 1. Find '0'
        // 2. Mark all elements in that Row and Col as '-1'.
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==0){
                    markRow(arr, i);
                    markCol(arr, j);
                }
            }
        }

        // 3. Now, find '-1' and replace it with '0'.
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]== -1){
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("Final Result Matrix: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        // Time Complexity:
        // T(n) = (mXn) X (m+n) + (mXn) = n^3

    }

    private static void markRow(int[][] arr, int i) {
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] arr, int j) {
        for(int i=0; i<arr.length; i++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }    
}
