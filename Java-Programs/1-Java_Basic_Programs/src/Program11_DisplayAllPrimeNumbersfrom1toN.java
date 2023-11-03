public class Program11_DisplayAllPrimeNumbersfrom1toN {
    public static void main(String[] args){

        CheckForPrime.isPrime(100);

    }
}

class CheckForPrime{
    static void isPrime(int upto){

        boolean flag;
        for(int num=0; num<=upto; num++){

            flag = true;
            if(num == 0 || num == 1){
                flag = false;
            }
    
            for(int i=2; i*i<=num; i++){
                if(num%i == 0){
                    flag = false;
                }
            }

            if(flag == true){
                System.out.println(num+" ");
            }
        }
        
    }
}

// SieveOfEratosthenes  