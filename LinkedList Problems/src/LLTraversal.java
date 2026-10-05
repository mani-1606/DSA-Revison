import ListNode.ListNode;
//Linked traversal
public class LLTraversal {
    public void helper(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }
}
