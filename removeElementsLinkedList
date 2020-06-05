/*Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5*/

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
    public ListNode removeElements(ListNode head, int val) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        ListNode temp = head;
        while(temp != null){
            if(temp.val != val){
                queue.add(temp.val);
            }
            temp = temp.next;
        }
        if(queue.isEmpty()){
            return null;
        }
        ListNode aux = new ListNode(queue.remove());
        ListNode temp2 = aux;
        for(int i=queue.size();i>0;i--){
                aux.next = new ListNode(queue.remove());
                aux = aux.next;
            
        }
        return temp2;
    }  
}