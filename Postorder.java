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
public class Postorder {
    public void postorder(TreeNode root, List<Integer>ar)
    {
        if(root==null)
        return ;
        postorder(root.left,ar);
        postorder(root.right,ar);
        ar.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ar= new ArrayList<>();
        postorder(root,ar);
        return ar;
    }
}
