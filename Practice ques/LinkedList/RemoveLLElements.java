public class RemoveLLElements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode removeElements(ListNode head, int val) {
        // set new node (-1) to be new head, so we can iteratively check next node
		// headNew -> (-1) -> (1) ->(2)->(3)->(4)->(6)->(3)->(6)
		//                                     ^
		//                                    cur
       ListNode curr = new ListNode(-1);
        ListNode newHead = curr;
        curr.next = head;
        
        while(curr != null){
            if(curr.next != null && curr.next.val == val){
                curr.next = curr.next.next;
            }
            
            else{
                curr = curr.next;
            }
        }
        return newHead.next;
    }
}
