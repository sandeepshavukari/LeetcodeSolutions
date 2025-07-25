import java.util.ArrayList;
import java.util.List;

//  * Definition for a binary tree node.
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
 
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root!=null)
        {
            li.addAll(inorderTraversal(root.left));
            li.add(root.val);
            li.addAll(inorderTraversal(root.right));
        }
        return li;   
    }
}