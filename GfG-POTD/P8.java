// Kth Ancestor in a Tree

public class P8 {
    public static void main(String[] args) {

        tNode root = new tNode(1);
        root.left = new tNode(2);
        root.right = new tNode(3);
        root.left.left = new tNode(4);
        root.left.right = new tNode(5); 

        System.out.println(kthAncestor(root, 1, 5));
    }

    static int kthAncestor(tNode root, int k, int node) {
        int[] ans = {-1};
        solve(root,k,node,ans);
        return ans[0];
    }

    static int solve(tNode root,int k,int node,int[] ans){

        if(root == null){
            return -1;
        }

        if(root.data == node){
            return 0;
        }

        int leftAns = solve(root.left,k,node,ans);
        int rightAns = solve(root.right,k,node,ans);
        
        if(leftAns!=-1 && rightAns==-1){
            if(leftAns+1 == k) ans[0] = root.data;
            return leftAns+1;
        }
        else if(leftAns == -1 && rightAns != -1){
            if(rightAns+1 == k) ans[0] = root.data;
            return rightAns+1;
        }

        return -1;
    }
}
