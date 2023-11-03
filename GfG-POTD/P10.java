// Lowest Common Ancestor in a BST

public class P10 {
    public static void main(String[] args) {
        tNode root = new tNode(1);
        root.left = new tNode(2);
        root.right = new tNode(3);
        root.left.left = new tNode(4);
        root.left.right = new tNode(5);

        tNode res = findLCA(root, 3, 5);
        System.out.println(res.data);
    }

    static tNode findLCA(tNode node, int n1, int n2) {
        // Base case
        if (node == null)
            return null;

        if (node.data == n1 || node.data == n2)
            return node;
 
        tNode left_lca = findLCA(node.left, n1, n2);
        tNode right_lca = findLCA(node.right, n1, n2);
 
        if (left_lca != null && right_lca != null)
            return node;
 
        return (left_lca != null) ? left_lca : right_lca;
    }

}