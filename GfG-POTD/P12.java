// Inorder Successor in BST

public class P12{
    public static void main(String[] args) {
        tNode root = new tNode(20);

        root.left = new tNode(10);
        root.right = new tNode(30);

        tNode x = new tNode(15);
        root.left.right = x;

        root.right.right = new tNode(40);
        root.right.right.right = new tNode(50);

        tNode ans = inorderSucc(root, x);
        System.out.println(ans.data);

    }

    static tNode inorderSucc(tNode root, tNode x){

        tNode succ = null;

        while(root != null){
            if(x.data >= root.data){
                root = root.right;
            }
            else{
                succ = root;
                root = root.left;
            }
        }

        return succ;
    }
}