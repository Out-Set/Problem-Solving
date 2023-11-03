import java.util.ArrayList;
import java.util.Collections;

// String Permutations


public class P19 {
    public static void main(String[] args) {
        
        ArrayList<String> ans = new ArrayList<String>();
        
        int index = 0;

        String S = "ABC";

        char[] ch = S.toCharArray();
        
        permute(ch, ans, index);

        Collections.sort(ans);
        
        System.out.println(ans);
        
    }
    
    static public void permute(char[] ch, ArrayList<String> ans, int index){
        
        if(index >= ch.length){
            String str = new String(ch);
            ans.add(str);
            return;
        }
        
        for(int j=index; j<ch.length; j++){
            
            char c = ch[index];
            ch[index] = ch[j];
            ch[j] = c;
            
            permute(ch, ans, index+1);
            
            char c1 = ch[index];
            ch[index] = ch[j];
            ch[j] = c1;            
        }
    }
}
