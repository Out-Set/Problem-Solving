package String;

public class CountDigit_1 {
    public static void main(String[] args) {
        int n = 12345;

        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);

        // Recursive Solution
        System.out.println(Count(12345));

    }

    static int Count(int n){
        if(n==0){
            return 0;
        }
        return 1+Count(n/10);

        
    }
}
