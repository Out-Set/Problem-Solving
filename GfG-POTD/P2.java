import java.util.HashMap;
import java.util.LinkedHashMap;


// First Non Repeating Character

class P2 {
    public static void main(String[] args) {

        String S = "zxvczbtxyzvy";

        HashMap<Character, Integer> hash_map = new LinkedHashMap<Character, Integer>();

        for(int i=0; i<S.length(); i++){

            Integer count = hash_map.get(S.charAt(i));

            if (count == null) {
                hash_map.put(S.charAt(i), 1);
            }
            // else increment the found value by 1
            else {
                hash_map.put(S.charAt(i), count+1);
            }
        }

        for(char c: S.toCharArray()){
            if(hash_map.get(c) == 1){
                System.out.println(c);
                return;
            }
        }
    }
}