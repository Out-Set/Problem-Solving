// Make Matrix Beautiful

// A beautiful matrix is a matrix in which the sum of elements in each row and column is equal. Given a square matrix of size NxN. 
// Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the 
// value of any one cell by 1.

public class P35 {
    public static void main(String[] args) {
        int N = 3;
        int matrix[][] = {{1, 2, 3},
                          {4, 2, 3},
                          {3, 2, 1}};

        int res = findMinOperation(N, matrix);
        System.out.println(res);
    }

    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum = sum + matrix[i][j];
            }
        }

        int rs = 0;
        int cs = 0;

        for(int i=0; i<N; i++){
            int a = 0;
            for(int j=0; j<N; j++){
                a = a + matrix[i][j];
            }
            rs = Math.max(rs, a);

            int b = 0;
            for(int j=0; j<N; j++){
                b = b + matrix[j][i];
            }
            cs = Math.max(cs, b);
        }

        int max = Math.max(rs, cs);

        return max*N-sum;
    }

}
