public class Program13_PrintSquareStarPattern {
    public static void main(String[] args) {
        
        SquareStarPattern.sqStrPattern(5);
    }
}

class SquareStarPattern {
    static void sqStrPattern(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row*2; j++){
                if(j==1 || j==row*2 || i==1 || i==row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}