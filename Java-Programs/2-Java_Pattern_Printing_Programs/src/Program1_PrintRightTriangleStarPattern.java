public class Program1_PrintRightTriangleStarPattern {
    public static void main(String[] args) throws Exception {
        
        RigthTriangle.rTriangle(5);
    }
}

class RigthTriangle {
    static void rTriangle(int row){

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}