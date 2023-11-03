public class Program5_PrintPyramidNumberPattern {
    public static void main(String[] args) {

        PyramidPattern.pyPattern(5);        
    }
}

class PyramidPattern {

    static void pyPattern(int row){

        int i, j, n = row;
        for(i=1;i<=n;i++){
            for(j=1;j<=n*2;j++){
                if(j>=(n+1)-i&&j<=(n-1)+i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

