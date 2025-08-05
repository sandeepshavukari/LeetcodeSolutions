import java.util.ArrayList;
import java.util.List;

   class TreeNode {
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
 
public class Preorder {
    public void preorder(TreeNode root,List<Integer> ar)
    {
        if(root==null)
        return;
        ar.add(root.val);
        preorder(root.left,ar);
        preorder(root.right,ar);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ar=new ArrayList<>();
        preorder(root,ar);
        return ar; 
    }
}
