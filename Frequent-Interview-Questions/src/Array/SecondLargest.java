package Array;

public class SecondLargest {
    public static void main(String[] args) {
        
        int a[] = new int[]{12, 34, 11, 99, 45, 67, 34};
        // System.out.println(firstLar(a));

        secondLar(a);

    }

    static int firstLar(int a[]){
        int res = 0;

        for(int i=1; i<a.length; i++){
            if(a[i] > a[res]){
                res = i;
            }
        }
        return res;
    }

    static void secondLar(int a[]){
        int fislargest = a[0];

        int secLargest = Integer.MAX_VALUE;

        for(int i=1; i<a.length; i++){
            if(a[i] > fislargest){
                secLargest = fislargest;
                fislargest = a[i];
            }
    
            else if(a[i] > secLargest){
                secLargest = a[i];
            }
        }
        System.out.println("first Largest="+fislargest+"\nsecond Largest="+secLargest);
    }

}
