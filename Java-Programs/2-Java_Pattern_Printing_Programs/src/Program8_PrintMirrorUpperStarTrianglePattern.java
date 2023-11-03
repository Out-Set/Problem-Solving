public class Program8_PrintMirrorUpperStarTrianglePattern {
    public static void main(String[] args) {
        
        MirrorUpperStarTriangle.MirUSTriangle(5);
    }
}

class MirrorUpperStarTriangle {
    static void MirUSTriangle(int row){

        // Upper Star Triangle
        for(int i=1; i<row; i++){
            for(int j=1; j<=row; j++){
                if(j >= row+1-i && j <= row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower Star Triangle
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j >= i && j <= row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}