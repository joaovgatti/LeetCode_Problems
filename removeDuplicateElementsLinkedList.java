/*Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
*/

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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp = head; 
        if(head == null){
            return head;
        }
       while(head.next != null){
           while(head.next.val == head.val){
               head.next = head.next.next;
               if(head.next == null){
                   break;
               }
           }
           head = head.next;
           if(head == null){
               break;
           }
       }
        return temp;
    }
}