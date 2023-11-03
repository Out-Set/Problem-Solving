package String;

public class Fibonacci_5 {
    public static void main(String[] args) {
        
        new Fibonacci_5().FIB1(9);

        System.out.println(new Fibonacci_5().FIB2(9));
    }

    void FIB1(int n){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);

        for(int i=1; i<=n; i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    int FIB2(int n){
        if(n<=1){
            return n;
        }

        return FIB2(n-1)+FIB2(n-2);
    }
}
