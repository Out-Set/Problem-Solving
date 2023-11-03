public class Program11_Convert_Long_to_String {
    public static void main(String[] args) {
        Long longVal = 999999999999999999L;
        System.out.println(longVal+" "+longVal.getClass().getTypeName());

        // 1.Using + operator
        String str1 = longVal + "";
        System.out.println(str1+" "+str1.getClass().getTypeName());

        // 2.Using String.valueOf()
        String str2 = String.valueOf(longVal);
        System.out.println(str2+" "+str2.getClass().getTypeName());

        // 3.Using Long.toString()
        String str3 = Long.toString(longVal);
        System.out.println(str3+" "+str3.getClass().getTypeName());

        // 4.Using String.format()
        String str4 = String.format("%d", longVal);
        System.out.println(str4+" "+str4.getClass().getTypeName());

        // 5.Using object.toString()
        String str5 = longVal.toString();
        System.out.println(str5+" "+str5.getClass().getTypeName());

        // 6.Using StringBuilder, StringBuffer object
        String str6 = new StringBuilder().append(longVal).toString();
        System.out.println(str6+" "+str6.getClass().getTypeName());
    }
}
