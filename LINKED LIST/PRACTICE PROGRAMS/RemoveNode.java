public class RemoveNode {
    

/**
  Definition for singly-linked list. **/
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Dummy node to handle removing the head
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer n nodes ahead
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        // Move both pointers simultaneously until the fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the node pointed by the slow pointer
        slow.next = slow.next.next;

        return dummy.next;
    }
}
}
    