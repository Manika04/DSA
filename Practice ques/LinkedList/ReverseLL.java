public class ReverseLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if(head== null || head.next == null) 
            return head;
         
         ListNode prev = null, temp = head;
         
         while(temp!= null){
             ListNode next = temp.next;
             temp.next = prev;
             prev = temp;
             temp = next;
         }
         return prev;
     }
     
}
