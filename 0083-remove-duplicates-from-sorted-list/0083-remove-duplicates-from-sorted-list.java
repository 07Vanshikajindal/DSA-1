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
        ListNode current = head ;
        while ( current !=null && current.next!=null){
            if( current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter number of nodes: ");
    //     int n = sc.nextInt();

    //     if (n == 0) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     // Create linked list
    //     System.out.println("Enter elements (sorted):");
    //     ListNode head = new ListNode(sc.nextInt());
    //     ListNode current = head;

    //     for (int i = 1; i < n; i++) {
    //         current.next = new ListNode(sc.nextInt());
    //         current = current.next;
    //     }

    //     // Remove duplicates
    //     head = deleteDuplicates(head);

    //     // Print result
    //     System.out.println("List after removing duplicates:");
    //     current = head;
    //     while (current != null) {
    //         System.out.print(current.val + " ");
    //         current = current.next;
    //     }
    // }
}