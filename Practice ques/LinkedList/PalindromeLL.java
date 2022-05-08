public class PalindromeLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast != null && fast.next !=  null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        boolean ans = true;
        
        while (prev != null) {
            if (head.val != prev.val) {
                ans = false;
                break;
            }
            head = head.next;
            prev = prev.next;
        }
        return ans;
    }
}
