// Leftmost and rightmost nodes of binary tree


import java.util.LinkedList;
import java.util.Queue;

class P45{
    public static void main(String[] args) {
        
    }

    public static void printCorner(Node node)
    {
        
        // add your code here    
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        q.add(null);
        
        boolean isFirst = false;
        boolean isOne = false;
        
        int last = 0;
        
        //iterating through the queue until it is empty
        while(q.isEmpty() != true)
        {
            Node temp = q.peek();
            q.poll();
            
            //printing the first node of each level
            if (isFirst == true)
		  {
			System.out.print(temp.data + " ");

			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);

			// make isFirst as false and one = 1
			isFirst = false;
			isOne = true;
		  }
		  //when encountering null, it means end of a level
		  else if(temp == null)
		  {
		      //if there are more nodes in the queue, add null for next level

		      if (q.size() >= 1)
				  q.add(null);

			
			isFirst = true;

				 
			if (isOne == false)
				System.out.print(last + " ");
		  }
		  else
		  {
		      last = temp.data;

			
			isOne = false;
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		  }
		  
        }
    }
}