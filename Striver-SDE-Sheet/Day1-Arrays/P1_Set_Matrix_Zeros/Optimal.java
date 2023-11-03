package P1_Set_Matrix_Zeros;

public class Optimal {
    public static void main(String[] args) {
        
        int matrix[][] = new int[][]{{1, 1, 1, 0, 1},                                 
                                     {1, 0, 1, 1, 1},
                                     {1, 1, 1, 1, 1},
                                     {1, 1, 1, 1, 1}};

        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = 1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    // mark the i-th row
                    matrix[i][0] = 0;

                    // mark the j-th col
                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if((matrix[i][j] != 0)){
                    // Check for col and row
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // For, 1st row and 1st col
        if(matrix[0][0] == 0){
            for(int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }

        // Final, result Matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
