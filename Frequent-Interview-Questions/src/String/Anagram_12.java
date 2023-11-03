package String;

import java.util.Arrays;

public class Anagram_12 {
    public static void main(String[] args) {
        
        String s1 = "race";
        String s2 = "care";

        System.out.println(anagram1(s1, s2));

        System.out.println(anagram2(s1, s2));

    }

    // With build in functions
    static boolean anagram1(String s1, String s2){
        
        // check if length is same
        if(s1.length() == s2.length()){
            // convert strings to char array
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();

            // sort the char array
            Arrays.sort(c1);
            Arrays.sort(c2);

            for(int i=0; i<c2.length; i++){
                if(c1[i]==c2[i]){
                    return true;
                }
            }
        }
        return false;
    }

    // Without build in functions
    static boolean anagram2(String s1, String s2){

        // check if length is same
        if(s1.length() == s2.length()){
            
            char c1[] = s1.toCharArray();

            for(int i=0; i<s1.length(); i++){
                for(int j=0; j<s2.length(); j++){
                    if(c1[i] < c1[j]){
                        char temp = c1[i];
                        c1[i] = c1[j];
                        c1[j] = temp;
                    }
                }
            }

        
            char c2[] = s2.toCharArray();

            for(int i=0; i<s1.length(); i++){
                for(int j=0; j<s2.length(); j++){
                    if(c2[i] < c2[j]){
                        char temp = c1[i];
                        c2[i] = c2[j];
                        c2[j] = temp;
                    }
                }
            }

            for(int i=0; i<c2.length; i++){
                if(c1[i]==c2[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
