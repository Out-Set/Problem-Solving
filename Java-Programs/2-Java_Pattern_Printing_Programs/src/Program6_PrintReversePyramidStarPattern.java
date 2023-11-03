public class Program6_PrintReversePyramidStarPattern {
    public static void main(String[] args) {
        
        ReversePyramidPattern.revYyPattern(5);
    }
}

class ReversePyramidPattern{
    static void revYyPattern(int row){
        for(int i=0;  i<=row; i++){
            for(int j=0; j<=row*2; j++){
                if(j>=i && j<=row*2-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}