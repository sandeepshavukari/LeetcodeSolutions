public class BalancedBinaryTree{
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static int getHeight(TreeNode root){
        if(root == null)
        return 0;
        int lh=getHeight(root.left);
        int rh=getHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        return true;
        int lh=getHeight(root.left);
        int rh=getHeight(root.right);
        if(Math.abs(lh-rh)<=1&&isBalanced(root.left)&&isBalanced(root.right))
        return true;
        return false;
    }
}
