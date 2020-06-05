/*Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10*/


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
    public int getDecimalValue(ListNode head) {
        int size = 0;
         ListNode temp = head;
         while(temp != null){
             size = size + 1;
             temp = temp.next;
         }
         int soma = 0;
         int exp = size - 1;
         while(head != null){
             int valor = 0;
             if(exp == 0 && head.val == 0){
                 valor = 0;
             }else {
                  valor = (int) Math.pow(2 * head.val, exp);
             }
             exp = exp - 1;
             soma = soma+valor;
             head = head.next;
         }
         return soma;
    }
}