class P18 {
    public static void main(String[] args) {
        int n = 5;
        
        int val = 'A'; // or int val = 69;
        
        val = val + n - 1;
        
        for(int i=1; i<=n; i++){
            
            int k = val;
            for(int j=1; j<=i; j++){
                System.out.print( (char)k );
                k++;
            }  
            val--;
            System.out.println();
        }
    }
}