public class DiameterOfBinaryTree {
     static int ml=0;
    public static int dfs(TreeNode root)
    {
        if(root==null)return 0;
        int l=dfs(root.left);
        int r=dfs(root.right);
        ml= Math.max(ml,l+r);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        ml=0;
        dfs(root);
        return ml;
    }
}
