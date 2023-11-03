public class Program4_PrintPeakDownLeftTriangleStarPattern {
    public static void main(String[] args) {
        
        PeakDownLeftTriangle.pdlTriangle(5);
    }
}

class PeakDownLeftTriangle{
    static void pdlTriangle(int row){
        for(int i=1; i<=row; i++){

            // Printing triangle
            for(int j=1; j<=(row+1-i); j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}