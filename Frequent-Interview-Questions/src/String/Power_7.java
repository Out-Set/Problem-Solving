package String;

public class Power_7 {
    public static void main(String[] args) {
        
        System.out.println(new Power_7().POWER(2, 4));

    }

    int POWER(int base, int expo){
    
        int res = 1;
        for(int i=1; i<=expo; i++){
            res = res*base;
        }
        return res;
    }
}
