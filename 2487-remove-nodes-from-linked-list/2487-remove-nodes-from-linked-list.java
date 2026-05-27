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
    
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int maxSoFar =curr.val;
        while( curr!= null && curr.next!=null){
            if ( curr.next.val < maxSoFar){
            curr.next = curr.next.next;
            }else {
                curr = curr.next;
                maxSoFar= curr.val;
            }
        }
        return reverse(head);
    }

    private ListNode reverse ( ListNode head){
        ListNode prev = null;
        while ( head !=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}