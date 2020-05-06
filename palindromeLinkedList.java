/**

Questao ->

    Given a singly linked list, determine if it is a palindrome.



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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        boolean palindrome = true;
        Stack<Integer> stack = new Stack<Integer>();
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head != null){
            if(stack.pop() == head.val){
                palindrome = true;
            }else{
                palindrome = false;
                break;
            }
            head = head.next;
        }
        return palindrome;
    }
}