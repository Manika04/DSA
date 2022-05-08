public class RemoveDuplicates {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t1 = head;
        ListNode t2 = head;

        if(head == null || head.next == null)
            return head;
        
        while(t2.next != null){
            if(t2.val == t2.next.val){
                t2 = t2.next;
                if(t2.next == null)
                    t1.next = null;
            }
            
            else{
                t2 = t2.next;
                t1.next = t2;
                t1 = t1.next;
            }           
        }
        return head;
    }
}
