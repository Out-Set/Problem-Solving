public class Program3_PrintPeakDownRightTriangleStarPattern {
    public static void main(String[] args) {
        
        PeakDownRightTriangle.pdrTriangle(5);
    }
}

class PeakDownRightTriangle{
    static void pdrTriangle(int row){
        for(int i=1; i<=row; i++){

            // Print space
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }

            // Printing triangle
            for(int j=i; j<=row; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}