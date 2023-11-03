public class Program7_PrintUpperStarTrianglePattern {
    public static void main(String[] args) {
        
        UpperStarTriangle.usTriangle(5);
    }
}

class UpperStarTriangle {
    static void usTriangle(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j >= row+1-i && j <= row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}