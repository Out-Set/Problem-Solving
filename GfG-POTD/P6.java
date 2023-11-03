import java.util.ArrayList;

class tNode {
    int data;
    tNode left;
    tNode right;
    tNode(int d){
        data = d;
    }
}

// Right View of Binary Tree.

public class P6 {
    public static void main(String[] args) {

        tNode root = new tNode(10);
        root.left = new tNode(20);
        root.right = new tNode(30);
        root.left.left = new tNode(40);
        root.left.right = new tNode(60);      
        
        // Print tree
        travrese(root);

        // Right View        
        System.out.println(rightView(root));
    }

    // Traversal
    static void travrese(tNode root){
        if(root != null){
            travrese(root.left);
            System.out.println(root.data + " ");
            travrese(root.right);
        }
    }


    // Right View
    static ArrayList<Integer> rightView(tNode root){

        ArrayList<Integer> al = new ArrayList<>();

        int level = 1;
        print(root, level, al);
        return al;        
    }

    static int maxLevel = 0;
    static void print(tNode root, int level, ArrayList<Integer> al){
        if(root == null){
            return;
        }

        if(maxLevel<level){
            al.add(root.data);
            maxLevel++;
        }

        level++;

        print(root.right, level, al);
        print(root.left, level, al);
    }
}
