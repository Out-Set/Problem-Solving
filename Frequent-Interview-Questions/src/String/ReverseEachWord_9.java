package String;

public class ReverseEachWord_9 {
    public static void main(String[] args) {
        
        System.out.println(new ReverseEachWord_9().reverseEachWord("hello good afternoon"));
    }

    String reverseEachWord(String s){

        String str[] = s.split(" ");

        String res = "";
        for(int i=0; i<str.length; i++){
            String word = str[i];
            for(int j=word.length()-1; j>=0; j--){
                res = res + word.charAt(j);
            }

            res = res + " ";
        }

        return res;
    }
}
