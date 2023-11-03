// Java program to take an integer as input and print it
import java.util.Scanner;

public class Program1_ReadTheInputFromStandardInput {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Inputed integer is: "+num);

        sc.close();
    }
}
