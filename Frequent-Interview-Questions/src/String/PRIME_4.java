package String;

public class PRIME_4 {
    public static void main(String[] args) {
        
        System.out.println(new PRIME_4().Prime(1));
        System.out.println(new PRIME_4().Prime(2));
        System.out.println(new PRIME_4().Prime(37));
    }

    boolean Prime(int n){
        if(n==0 || n==1){
            return false;
        }

        if(n==2 || n==3){
            return true;
        }

        if(n%2==0 && n%3==0){
            return false;
        }

        for(int i=5; i*i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
