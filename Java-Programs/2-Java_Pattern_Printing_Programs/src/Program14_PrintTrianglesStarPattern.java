public class Program14_PrintTrianglesStarPattern {
    public static void main(String[] args) {
        
        PrintTriangles.pTriangles(10);
    }
}

class PrintTriangles {
    static void pTriangles(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j>=row+1-i && j<=row)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}