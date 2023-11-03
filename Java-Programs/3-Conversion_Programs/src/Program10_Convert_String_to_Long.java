public class Program10_Convert_String_to_Long {
    public static void main(String[] args) {
        String longString = "9999999999999999";
        System.out.println(longString+" "+longString.getClass().getTypeName());

        // 1.Using Long.parseLong() method of Long Class 
        Long l1 = Long.parseLong(longString);
        System.out.println(l1+" "+l1.getClass().getTypeName());


        // 2.Using valueOf() method of Long Class 
        Long l2 = Long.valueOf(longString);
        System.out.println(l2+" "+l2.getClass().getTypeName());
    }
}
