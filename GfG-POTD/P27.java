// Non Repeating Numbers
// Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

class P27 {
    public static void main(String[] args) {
        
        int arr[] = {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};

        int res[]  = singleNumber(arr);

        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }

    static int[] singleNumber(int[] nums) {
        // Code here
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        for(var entry : map.entrySet()){
            if(entry.getValue() == 1){
                al.add(entry.getKey());
            }
        }

        Collections.sort(al);
        int res[] = new int[2];
        for(int i=0; i<al.size(); i++){
            res[i] = al.get(i);
        }

        return res;
    }
}