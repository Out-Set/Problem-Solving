public class Program10_PrintMirrorLowerStarTrianglePattern {
    public static void main(String[] args) {
        
        MirrorDownwardStarTriangle.MirDStriangle(5);
    }
}

class MirrorDownwardStarTriangle {
    static void MirDStriangle(int row){

        // Upper
        for(int i=1; i<row; i++){
            for(int j=1; j<=row; j++){
                if(j >= 1 && j <= row+1-i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j >= 1 && j <= i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}