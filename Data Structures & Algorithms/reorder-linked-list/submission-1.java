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
    public void reorderList(ListNode head) {

        // defining size of LL
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Creating an array from LL

        int[] arr = new int[size];

        ListNode temp1 = head;

        int i =0 ;

        while(temp1!=null){

            arr[i] = temp1.val;
            i++;
            temp1=temp1.next;

        }

        // Creting a reordered array

        int[] arr1 = new int[size];

        int left = 0;
        int right = arr.length-1;
        int pos = 0;

        while(left<=right){
            arr1[pos]=arr[left];
            left++;
            pos++;

            if(left<=right){
                arr1[pos]=arr[right];
                right--;
                pos++;
            }


            

        }

        // putting back to LL
        
        ListNode mover = head;
        int z =0 ;
        while(mover!=null){
            mover.val = arr1[z];
            z++;
            mover=mover.next;
        }



        

    }
}
