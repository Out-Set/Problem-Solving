// object.getClass().getSimpleName()- tells the type

public class Program8_Convert_String_to_Double {
    public static void main(String[] args) {
        
        String str = "23.098";
        System.out.println(str+" "+str.getClass().getSimpleName());

        // 1.Using the parseDouble() method of Double class
        Double d1 = Double.parseDouble(str);
        System.out.println(d1.getClass().getSimpleName()+" "+d1);

        // 2.Using valueOf() method of Double class
        Double d2 = Double.valueOf(str);
        System.out.println(d2.getClass().getSimpleName()+" " +d2);
    }
}
