package String;

public class SUBSET_11 {
    public static void main(String[] args) {

        new SUBSET_11().Subset("ABC", " ", 0);
        
    }

    void Subset(String s, String curr, int i){

        if(i == s.length()){
            System.out.println(curr);
            return;
        }

        Subset(s, curr, i+1);  // Do not pick
        Subset(s, curr+s.charAt(i), i+1);  // pick
    }
}
