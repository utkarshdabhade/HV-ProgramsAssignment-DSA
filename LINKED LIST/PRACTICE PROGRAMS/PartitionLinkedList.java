/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        {
        ListNode lessHead = new ListNode(0);
        ListNode greaterOrEqualHead = new ListNode(0);
        ListNode lessPtr = lessHead;
        ListNode greaterOrEqualPtr = greaterOrEqualHead;

        while (head != null) {
            if (head.val < x) {
                lessPtr.next = head;
                lessPtr = lessPtr.next;
            } else {
                greaterOrEqualPtr.next = head;
                greaterOrEqualPtr = greaterOrEqualPtr.next;
            }
            head = head.next;
        }

        greaterOrEqualPtr.next = null; // Remove any remaining links

        lessPtr.next = greaterOrEqualHead.next;

        return lessHead.next;
    }
}
}
