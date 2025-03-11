import java.util.Stack;

public class ReverseALinkedList {
    // class ListNode 
    // {
    //     int val;
    //     ListNode next;
    //     ListNode() {}
    //     ListNode(int val) { this.val = val; }
    //     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    // }
    public ListNode reverseList(ListNode head) {
        // ListNode new_node=null;
        Stack<Integer> s=new Stack<>();
        if(head==null)
        {
            return head;
        }
        while(head!=null)
        {
            s.push(head.val);
            head=head.next;
        }
        ListNode new_node=null;
        ListNode temp=null;
        while(!s.isEmpty())
        {
            if(new_node==null)
            {
                new_node=new ListNode(s.pop());
                temp=new_node;
            }
            else
            {
                temp.next=new ListNode(s.pop());
                temp=temp.next;
            }
        }
        return new_node;
    }
}

