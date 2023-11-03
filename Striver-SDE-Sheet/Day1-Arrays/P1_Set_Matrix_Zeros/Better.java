package P1_Set_Matrix_Zeros;

public class Better {
    public static void main(String[] args) {
        
        int arr[][] = new int[][]{{1, 1, 1, 0, 1},                                 
                                  {1, 0, 1, 1, 1},
                                  {1, 1, 1, 1, 1},
                                  {1, 1, 1, 1, 1}};

        int m = 4;
        int n = 5;

        //  Logic:
        // 1. Create 2-Auxilary array of Row and Col, initially filled with '0'.
        int row[] = new int[m];
        int col[] = new int[n];

        // 2. Now, search for '0', if found mark the row and col as '1'.
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // 3. Now, Retraverse the initial arr[].
        // 4. On the basics of Auxilary row and col array, replace '1' with '0' in arr[].
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((row[i]==1) || (col[j]==1)){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Time Complexity: 
        // T(n) = O(mXn) + O(mXn) = n^2

        // Space Complexity:
        // O(m) + O(n), for the two aux array row[m] and col[n].
    }
}
