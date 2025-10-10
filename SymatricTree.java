public class SymatricTree{
    public static boolean equal(TreeNode left, TreeNode right) {
        if (left==null&&right==null) return true;
        else if (left==null || right == null || left.val!=right.val) return false;
        else return equal(left.left,right.right)&&equal(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
         return equal(root,root);
    }
}