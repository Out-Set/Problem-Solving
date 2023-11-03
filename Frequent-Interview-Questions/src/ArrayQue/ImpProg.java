package ArrayQue;

public class ImpProg {
    
    public static void main(String[] args) {
        
        int[][] arr = new int[8][8];

        int n = arr.length;

        for(int i=0; i<n; i++) {
            
            if(i%2==0){

                for(int j=0; j<n; j++) {

                    if(j%2==0) {

                        arr[i][j] = 1;
                    } 
                    else{
                        arr[i][j] = 0;
                    }
                }
            }

            else{

                for(int j=0; j<n; j++) {

                    if(j%2==0) {

                        arr[i][j] = 0;
                    } 
                    else{
                        arr[i][j] = 1;
                    }
                }
            }

            for(int l=0; l<n; l++) {
                System.out.print(arr[i][l]);
            }
            System.out.println();
        }

        // for(int k=0; k<n; k++){
        //     for(int l=0; l<n; l++) {
        //         System.out.print(arr[k][l]);
        //     }
        //     System.out.println();
        // }
    }    
}
