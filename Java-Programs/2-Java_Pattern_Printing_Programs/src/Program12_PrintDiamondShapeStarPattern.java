public class Program12_PrintDiamondShapeStarPattern {
    public static void main(String[] args) {
        
        DiamondPattern.dPattern(5);
    }
}

class DiamondPattern {
    static void dPattern(int row){

        // Upper
        for(int i=1; i<row; i++){
            for(int j=1; j<=row*2; j++){
                if(j>=row+1-i && j<=row+i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row*2; j++){
                if(j>=i && j<=row*2-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}