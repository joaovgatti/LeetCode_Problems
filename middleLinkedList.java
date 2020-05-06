/**

Questao->
    Given a non-empty, singly linked list with head node head, return a middle node of linked list.

    If there are two middle nodes, return the second middle node.

 


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
    public ListNode middleNode(ListNode head) {
        int cont = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            cont++;
        }
        for(int i=0;i<cont/2;i++){
            head = head.next;
            
        }
        return head;
    }
}