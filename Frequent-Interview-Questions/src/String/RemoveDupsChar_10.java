package String;

public class RemoveDupsChar_10 {
    public static void main(String[] args) {
        

        System.out.println(new RemoveDupsChar_10().removeDupsChars("aabccdddef"));
    }

    String removeDupsChars(String s){

        String str = "";
        str = str + s.charAt(0);

        char ch = s.charAt(0);

        for(int i=0; i<s.length()-1; i++){

            if(ch == s.charAt(i)+1){
                continue;
            }

            ch = (char)(s.charAt(i)+1);

            str = str + s.charAt(i)+1;
            
        }

        return str;
    }
}
