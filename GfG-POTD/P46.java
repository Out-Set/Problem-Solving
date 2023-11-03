import java.util.ArrayList;
import java.util.Collections;

public class P46 {
    public static void main(String[] args) {
        
    }

    class Res
    {
       ArrayList<Integer> leaf_height = new ArrayList<Integer>();  // Create a list to store the leaf heights
    }
    
    public void getLeafHeightRecur(Node node, Res r, int pathLen)  // Recursive function to get the leaf heights
    {
        
        if (node==null)	return;  // If the node is null, return
        
        pathLen++;  // Increment the path length
        
        if (node.left==null && node.right==null)  // If the node is a leaf node
        {
            r.leaf_height.add(pathLen);  // Add the path length to the list of leaf heights
             
        }
        
        // Recursively call the function on the left and right child nodes
        else{  
            getLeafHeightRecur(node.left, r, pathLen);
            getLeafHeightRecur(node.right, r, pathLen);
        }
    }

    
    public int getCount(Node node, int bud)
    {
        Res r = new Res();
        getLeafHeightRecur(node, r, 0);  // Call the recursive function to get the leaf heights
        Collections.sort(r.leaf_height);  // Sort the leaf heights in ascending order
        int cnt = 0;
         
        for(int i=0; i<r.leaf_height.size(); i++)  // Iterate through the sorted leaf heights
        {
            if(bud-r.leaf_height.get(i)<0)  // Check if the remaining budget is less than the current leaf height
                return cnt;  // If so, return the count
            else 
                cnt++;  // Increment the count
            bud-=r.leaf_height.get(i);  // Subtract the current leaf height from the budget
        }
        
        return cnt;  // Return the final count    
    }
}
