import java.util.ArrayList;

// Median of BST

public class P11 {
    public static void main(String[] args) {
        
        tNode root = new tNode(20);

        root.left = new tNode(10);
        root.right = new tNode(30);

        root.left.right = new tNode(15);
        root.right.right = new tNode(40);
        root.right.right.right = new tNode(50);

        ArrayList<Integer> al = new ArrayList<>();
        traverse(root, al);
        int size = al.size();
        
        if (size % 2 == 0) {
            float l = al.get(size / 2);
            float m = al.get(size / 2 - 1);
            System.out.println((l + m) / 2);
        } 
        
        else {
            System.out.println(al.get(size / 2));
        }

    }

    static void traverse(tNode root, ArrayList<Integer> al){
        if(root != null){
            traverse(root.left, al);
            al.add(root.data);
            traverse(root.right, al);
        }
    }
}
