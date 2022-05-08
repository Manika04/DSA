public class IntersectionOf2LL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
           return null;
       
       ListNode temp = headA;
       ListNode temp1 = headB;
       
       while(temp != temp1){
           if(temp1 == null)
               temp1 = headA;
           else
               temp1 = temp1.next;
           if(temp == null)
               temp = headB;
           else
               temp = temp.next;
           
       }
       return temp;
   }
}
