// Level order traversal in spiral form

import java.util.Stack;

public class P7 {
    public static void main(String[] args) {
        tNode root = new tNode(10);
        root.left = new tNode(20);
        root.right = new tNode(30);
        root.left.left = new tNode(40);
        root.left.right = new tNode(60);   

        // Spiral Level Order Traversal
        printSpiral(root);

    }

    static void printSpiral(tNode node) {
        if (node == null){
            return;
        }

        Stack<tNode> s1 = new Stack<tNode>();
        Stack<tNode> s2 = new Stack<tNode>();
 
        s1.push(node);
 
        while (!s1.empty() || !s2.empty()) {

            while (!s1.empty()) {
                tNode temp = s1.peek();
                s1.pop();
                System.out.print(temp.data + " ");
 
                if (temp.right != null){
                    s2.push(temp.right);
                }
 
                if (temp.left != null){
                    s2.push(temp.left);
                }
            }
 
            while (!s2.empty()) {
                tNode temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");
 
                if (temp.left != null){
                    s1.push(temp.left);
                }
                if (temp.right != null){
                    s1.push(temp.right);
                }
            }
        }
    }

}
