package Array;

public class DivisorOfANum {
    public static void main(String[] args) {
        
        int num = 98;

        for(int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
