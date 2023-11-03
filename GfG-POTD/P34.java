// Surround the 1's

// Given a matrix of order nxm, composed of only 0's and 1's, find the number of 1's in the matrix 
// that are surrounded by an even number (>0) of 0's. The surrounding of a cell in the matrix is defined 
// as the elements above, below, on left, on right as well as the 4 diagonal elements around the cell of the matrix. 
// Hence, the surrounding of any matrix elements is composed of 8 elements. Find the number of such 1's.

class P34 {
    public static void main(String[] args) {
        int [][]matrix = {{1, 0, 0}, 
                          {1, 1, 0}, 
                          {0, 1, 0}};

        int res = Count(matrix);
        System.out.println(res);
    }

    public static int Count(int[][] matrix) {
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;
        for(int i = 0; i < n; i++){
        	for(int j = 0; j < m; j++){
        		if(matrix[i][j]==1){
        			int cnt = 0;
        			if(i - 1 >= 0)
        				cnt += matrix[i-1][j] == 0?1:0;
        			if(i + 1 < n)
        				cnt += matrix[i+1][j] == 0?1:0;
        			if(j - 1 >= 0)
        				cnt += matrix[i][j-1] == 0?1:0;
        			if(j + 1 < m)
        				cnt += matrix[i][j+1] == 0?1:0;
        			if(i - 1 >= 0 && j - 1 >= 0)
        				cnt += matrix[i-1][j-1] == 0?1:0;
        			if(i - 1 >= 0 && j + 1 < m)
        				cnt += matrix[i-1][j+1] == 0?1:0;
        			if(i + 1 < n && j - 1 >= 0)
        				cnt += matrix[i+1][j-1] == 0?1:0;
        			if(i + 1 < n && j + 1 < m)
        				cnt += matrix[i+1][j+1] == 0?1:0;
        			if((cnt & 1)==0 && cnt!=0)
        				ans++;
        		}
        	}
        }
        return ans;
    }
}