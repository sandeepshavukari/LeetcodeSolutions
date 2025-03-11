public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode new_node=null;
        ListNode node=null;
        ListNode temp=head;
        ListNode cmp=head;
        int n=0;
        Stack<Integer> s= new Stack<>();
        while(temp!=null)
        {
            n++;
            s.push(temp.val);
            temp=temp.next;
        }
        while(!s.isEmpty())
        {
            if(new_node==null)
            {
                new_node = new ListNode(s.pop());
                node=new_node;
            }
            else
            {
                node.next= new ListNode(s.pop());
                node=node.next;
            }
        }
        while(cmp!=null&&new_node!=null)
        {
            if(cmp.val!=new_node.val)
                return false;
            else
            {
                cmp=cmp.next;
                new_node=new_node.next;
            }
        }
        return true;
        // return false;
    }
}
