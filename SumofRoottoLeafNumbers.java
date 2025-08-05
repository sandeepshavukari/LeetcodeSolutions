public class SumofRoottoLeafNumbers {
    public int dfs(TreeNode root,int cs)
    {
        if(root==null) return 0;
        cs=cs*10+root.val;
        if(root.left==null&&root.right==null)
        {
            return cs;
        }
        return dfs(root.left,cs)+dfs(root.right,cs);
    }
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
}
