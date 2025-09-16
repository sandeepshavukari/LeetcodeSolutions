import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class RemeoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        Set<Integer> set =new HashSet<>();
        ListNode dset =new ListNode(0);
        dset.next =head;
        ListNode prev =dset;
        ListNode curr =head;
        while (curr!=null) {
            if (set.contains(curr.val)) {
                prev.next =curr.next;
            } else {
                set.add(curr.val);
                prev =curr;
            }
            curr =curr.next;
        }
        return dset.next;
    }
}
