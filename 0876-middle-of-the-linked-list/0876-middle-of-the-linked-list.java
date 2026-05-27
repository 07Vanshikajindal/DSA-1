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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head ;
        while (fast !=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter number of nodes: ");
    //     int n = sc.nextInt();

    //     if (n == 0) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     // Create linked list
    //     System.out.println("Enter elements:");
    //     ListNode head = new ListNode(sc.nextInt());
    //     ListNode current = head;

    //     for (int i = 1; i < n; i++) {
    //         current.next = new ListNode(sc.nextInt());
    //         current = current.next;
    //     }

    //     // Find middle
    //     ListNode mid = middleNode(head);
    //  System.out.println("Middle node and onward:");
    //     while (mid != null) {
    //         System.out.print(mid.val + " ");
    //         mid = mid.next;
    //     }
    // }
}