public class Program12_Int_to_Char_Conversion {
    public static void main(String[] args) {
        int intNum1 = 97;
        int intNum2 = 88439790;
        System.out.println("intNum1 "+intNum1);
        System.out.println("intNum2 "+intNum2);

        // 1.Typecasting: typecasts into its corrosponding ASCII value
        char ch = (char)intNum1;
        System.out.println(ch);

        // 1.Using switch case with str.charAt()
        // number to string: num +(concat)""
        IntToChar1.intToChar(intNum2+"");

        // 3.Using switch case with modulo operator
        // first reverse the given number with the help of modulo operator then apply switch case directly
    }
}

// 2. Using switch case with str.charAt()
class IntToChar1 {
    static void intToChar(String s){
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case '1':
                    System.out.print("One ");
                    break;

                case '2':
                    System.out.print("Two ");
                    break;

                case '3':
                    System.out.print("Three ");
                    break;
                
                case '4':
                    System.out.print("Four ");
                    break;

                case '5':
                    System.out.print("Five ");
                    break;

                case '6':
                    System.out.print("Six ");
                    break;

                case '7':
                    System.out.print("Seven ");
                    break;
                
                case '8':
                    System.out.print("Eight ");
                    break;

                case '9':
                    System.out.print("Nine ");
                    break;
                
                case '0':
                    System.out.print("Zero ");
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}