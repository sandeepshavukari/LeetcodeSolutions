public class MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode a = list1;
        ListNode b = list2;
        ListNode result = null;

        if (a == null)
            return b;
        else if (b == null)
            return a;
        if (a.val <= b.val) {
            result = a;
            result.next
                = mergeTwoLists(a.next, b);
        }
        else {
            result = b;
            result.next
                = mergeTwoLists(a, b.next);
        }
        return result;
    
    }
}
