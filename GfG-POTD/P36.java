// Find the string in grid

// Given a 2D grid of n*m of characters and a word, find all occurrences of given word in grid. 
// A word can be matched in all 8 directions at any point. Word is said to be found in a direction 
// if all characters match in this direction (not in zig-zag form). The 8 directions are, horizontally left, 
// horizontally right, vertically up, vertically down, and 4 diagonal directions.

import java.util.ArrayList;

public class P36 {
    public static void main(String[] args) {
        
        char[][] grid = {{'a','b','c'},
                         {'d','r','f'},
                         {'g','h','i'}};
                         
        String word = "abc";
        
        int[][] arr = searchWord(grid, word);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[i][j] + " ");
            }
        }
    }

    public  static int[][] searchWord(char[][] grid, String word) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        
        int row[] = {-1,-1,0,1,1,1,0,-1};
        int col[] = {0,1,1,1,0,-1,-1,-1};
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(grid[i][j]==word.charAt(0)){
                    int res = 0;
                    for(int k=0; k<8; k++){
                        int r = i+row[k];
                        int c = j+col[k];
                        
                        int count = 0;
                        if(word.length()>1){
                            if(isSafe(r,c,1,grid,word,n,m)){
                                count = solve(r,c,2,grid,word,n,m,row[k],col[k]);
                                if(count==1){
                                    res = 1;
                                    break;
                                }
                            }
                        }
                        else res = 1;
                    }
                    if(res==1){
                        ArrayList<Integer> abc = new ArrayList<>();
                        abc.add(i);
                        abc.add(j);
                        list.add(abc);
                    }
                }
            }
        }
        int arr[][] = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            arr[i][0] = list.get(i).get(0);
            arr[i][1] = list.get(i).get(1);
        }
        
        return arr;
        
    }
    
    static boolean isSafe(int i, int j, int k, char[][] grid, String word, int n, int m){
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]==word.charAt(k)) return true;
        return false;
    }
    
    static int solve(int i, int j, int k, char[][] grid, String word, int n, int m, int row, int col){
        if(k==word.length()) return 1;
        if(isSafe(i+row,j+col,k,grid, word,n,m)){
            int count = solve(i+row,j+col,k+1,grid,word,n,m,row,col);
            if(count==1) return 1;
        }
        return 0;
    }
}
