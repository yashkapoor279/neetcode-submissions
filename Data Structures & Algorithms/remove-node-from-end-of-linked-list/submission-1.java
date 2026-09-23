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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode newhead = prev;

        if (newhead == null) {
            return newhead;
        } else if (n == 1) {
            ListNode temp = newhead;
            newhead = newhead.next;
        } else {
            int count = 0;
            ListNode temp = newhead;
            ListNode prev2 = null;

            while (temp != null) {
                count++;

                if (count == n) {
                    prev2.next = prev2.next.next;
                    break;
                }

                prev2 = temp;
                temp = temp.next;
            }
        }

        ListNode prev1 = null;
        ListNode curr1 = newhead;

        while (curr1 != null) {
            ListNode next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }

        return prev1;


    }
}
