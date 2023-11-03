package Array;

public class Missing1to100 {
    public static void main(String[] args) {
        
        // 4 is missing
        int a1[] = new int[]{2, 3, 1, 5};
        System.out.println("Missing Number: " + missingOne(a1));

        // 4, 8, 10 missing
        int a2[] = new int[]{1, 2, 3, 5, 6, 7, 9, 11};
        new Missing1to100().missingMany(a2);

        // System.out.println(5 + 4 + "56" + 4 + 6);
    }

    static int missingOne(int a[]){

        int n = a.length+1;
        System.out.println(n);

        int sum = (n*(n+1))/2;

        for(int i=0; i<a.length; i++){
            sum = sum - a[i];
        }
        return sum;
    }

    void missingMany(int a[]){
        int reg[] = new int[11];

        for(int i=0; i<a.length-1; i++){
            reg[a[i]] = 1;
        }
        
        for(int i=0; i<reg.length; i++){
            if(reg[i] == 0){
                System.out.println(i);
            }
        }
    }
}
