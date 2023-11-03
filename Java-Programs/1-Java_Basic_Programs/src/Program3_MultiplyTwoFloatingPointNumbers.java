import java.util.Scanner;

public class Program3_MultiplyTwoFloatingPointNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.print("Enter first num: ");
        num1 = sc.nextFloat();

        System.out.print("Enter second num: ");
        num2 = sc.nextFloat();

        float result = num1*num2;
        System.out.println("Multiplication of num1 and num2 is: "+result);

        sc.close();

        // pre-input
        float f1 = 1.8f;
        float f2 = 3.2f;

        float mul = f1*f2;
        System.out.println("Pre-inputed value result: "+mul);

    }
}
