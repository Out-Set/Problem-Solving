// Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes
public class Program17_FindSumOfFibonacciSeriesNumbersOfFirstNEvenIndexes {
    public static void main(String[] args) {
        SumOfFirstNEvenFibonacciNumber.fib(10);
    }
}

class SumOfFirstNEvenFibonacciNumber{
    static int fib(int num){
        if(num == 0){
            return 0;
        }
        return fib(num - 1)+fib(num - 2);
    }
}