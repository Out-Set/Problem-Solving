public class Program7_Boolean_toString_method {
    public static void main(String[] args) {
        
        // toString(): method, converts an input into string
        ToStringMethod.boolToString(false);
        ToStringMethod.boolToString(true);
    }
}

class ToStringMethod {
    static void boolToString(boolean b){
        String str = Boolean.toString(b);
        System.out.println(str);
    }
}
