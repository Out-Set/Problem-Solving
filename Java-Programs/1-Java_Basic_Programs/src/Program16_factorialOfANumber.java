public class Program16_factorialOfANumber {
    public static void main(String[] args) {

        System.out.println(FindFactorial.fact(5));
        System.out.println(FindFactorial.fact(10));

        // Using Ternary Operator
        System.out.println(FindFactorial.fact2(5));
        System.out.println(FindFactorial.fact2(10));
    }
}

class FindFactorial {
    static int fact(int num){

        if(num == 0){
            return 1;
        }
        int prod = 1;
        while(num != 0){
            prod = prod*num;
            num--;
        }
        return prod;
    }

    // Using Ternar Operator
    static int fact2(int num){

        // Find factorial in one line
        return (num == 1 || num == 0) ? 1 : num * fact2(num - 1);
    }
}