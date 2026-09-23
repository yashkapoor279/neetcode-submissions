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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        // defining dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // assigning varibale/mover to listnode
        ListNode leftprev = dummy;
        ListNode current = head;

        //traversing till first node to be reversed is found
        for(int i = 0 ; i< left -1 ; i++){
            leftprev = leftprev.next;
            current = current.next;

        }

        // defining head of the new LL
        ListNode subList = current;

        // Reversing
        ListNode prev = null;
        for(int i =0;i<=right-left;i++){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }

        // joining the broken connections
        leftprev.next=prev;
        subList.next=current;

        // returning the list
        return dummy.next;
        
    }
}