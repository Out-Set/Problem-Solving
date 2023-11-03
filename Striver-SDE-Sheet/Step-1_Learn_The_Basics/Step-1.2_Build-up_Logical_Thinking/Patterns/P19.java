public class P19 {
    public static void main(String[] args) {
        int n = 5;

        // upper
        for(int i=1; i<=n; i++){
            
            // stars
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            
            //space
            for(int j=1; j<=2*i-2; j++){
                System.out.print(" ");
            }
            
            // stars
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // lower
        for(int i=1; i<=n; i++){
            
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //space
            for(int j=1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }
            
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
