// Fraction pairs with sum 1

import java.util.HashMap;

public class P21 {
    public static void main(String[] args) {
        int nr[] = new int[]{1, 2, 2, 8};
        int dr[] = new int[]{2, 4, 6, 12};
        int res = countFractions(4, nr, dr);
        System.out.println(res);

        int nr1[] = {3, 1, 12, 81, 2};
        int dr1[] = {9, 10, 18, 90, 5};
        int res1 = countFractions(5, nr1, dr1);
        System.out.println(res1);
    }

    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
         int count = 0;
        HashMap<Double,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            double t1 = (double)numerator[i]/denominator[i];
            double t2 = (double)(denominator[i] - numerator[i])/denominator[i];
            if(hmap.containsKey(t2))
            {
                count += hmap.get(t2);
            }
            hmap.put(t1,hmap.getOrDefault(t1,0)+1);
        }
        return count;
    }
}
