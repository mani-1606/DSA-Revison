import ListNode.ListNode;
//lc = 206
public class ReverseaLL {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode a = head.next;
        head.next=null;
        ListNode b = reverseList(a);
        a.next=head;
        return b;
    }
}
