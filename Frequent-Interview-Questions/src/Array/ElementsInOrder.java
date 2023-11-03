package Array;

public class ElementsInOrder {
    public static void main(String[] args) {
        
        int a[] = new int[]{1,2,3};
        int b[] = new int[]{2,3,5};
        int c[] = new int[]{6,7,9};

        System.out.println(new ElementsInOrder().inOrder(a));
        System.out.println(new ElementsInOrder().inOrder(b));
        System.out.println(new ElementsInOrder().inOrder(c));        
    }

    boolean inOrder(int a[]){
        for(int i=0; i<a.length-1; i++){
            if(a[i+1] - a[i] != 1){
                return false;
            }
        }
        return true;
    }
}
