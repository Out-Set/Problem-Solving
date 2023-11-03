import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Link for this tutorial: https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
public class Program2_GetInputFromTheUser {
    public static void main(String[] args) throws IOException{

        // 1.Using Buffered Reader Class
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a string For Buffered Reader: ");
        String name = reader.readLine();
        System.out.println(name);


        // 2. Using Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string For Scanner Class: ");
        String str = sc.nextLine();
        System.out.println("Entered string: "+str);

        System.out.print("Input a integer For Scanner Class: ");
        int num = sc.nextInt();
        System.out.println("Entered integer is: "+num);

        System.out.print("Input a float point For Scanner Class: ");
        float floatNum = sc.nextFloat();
        System.out.println("Entered floating num is: "+floatNum);

        sc.close();


        // 3. Using Console Class
        // Note that this program does not work on IDEs as System.console() may require console
        System.out.println("Input a string For Console Class: ");

        String str2 = System.console().readLine();
        System.out.println("You entered string: "+str2);


        // 4. Using Command line argument
        // To run it, on command line:
        // compile the code: javac className.java
        // give the arguments: java Main Hello World
        if(args.length > 0){
            System.out.println("The command line arguments are: ");

            for (String val : args) {
                System.out.println(val);
            }
        }
        else
            System.out.println("No command Line arguments found.");

        // output: 
        // The command line arguments are:
        // Hello
        // World
    }
}
