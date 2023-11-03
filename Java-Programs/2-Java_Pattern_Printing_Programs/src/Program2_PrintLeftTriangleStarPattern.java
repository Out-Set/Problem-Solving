public class Program2_PrintLeftTriangleStarPattern {
    public static void main(String[] args) {
        
        LeftTriangle.lTriangle(5);
    }
}

class LeftTriangle {
    static void lTriangle(int row){
        for(int i=1; i<=row; i++){

            // Print space
            for(int j=1; j<=(row+1-i); j++){
                System.out.print("  ");
            }

            // Print triangle
            for(int j=(row+1-i); j<=row; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}