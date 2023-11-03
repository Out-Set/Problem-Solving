public class Program9_Convert_Double_to_String {
    public static void main(String[] args) {
        Double dVal = 45.980;
        System.out.println(dVal+" "+dVal.getClass().getTypeName());

        // 1.Using valueOf() method of String class 
        String str1 = String.valueOf(dVal);
        System.out.println(str1.getClass().getTypeName()+" "+str1);

        // 2.Using toString() method of Double class
        String str2 = Double.toString(dVal);
        System.out.println(str2.getClass().getTypeName()+" "+str2);
    }
}

