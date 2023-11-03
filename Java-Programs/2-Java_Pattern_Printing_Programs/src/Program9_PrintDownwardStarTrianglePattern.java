public class Program9_PrintDownwardStarTrianglePattern {
    public static void main(String[] args) {
        
        DownwardStarTriangle.DStriangle(5);
    }
}

class DownwardStarTriangle {
    static void DStriangle(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j >= 1 && j <= row+1-i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}