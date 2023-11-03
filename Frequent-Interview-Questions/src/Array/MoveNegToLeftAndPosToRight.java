package Array;

public class MoveNegToLeftAndPosToRight {
    public static void main(String[] args) {
        
        // int a[] = new int[]{12, 45, -4, -5, 0, -5, 6};
        int a1[] = new int[]{-12, 11, -13, 0, -5, 6, 7, 5, -3, -6};

        int n = a1.length;
        shiftIntegers(a1, n);

        for(int i=0; i<n; i++){
            System.out.println(a1[i] + " ");
        }

    }

    static void shiftIntegers(int a[], int n)
    {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                j++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}
