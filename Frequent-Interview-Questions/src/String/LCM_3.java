package String;

public class LCM_3 {
    public static void main(String[] args) {
        
        System.out.println(new LCM_3().LCM(2, 4));
    }

    int LCM(int a, int b){

        int res = Math.max(a, b);
        while(true){

            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    } 
}
