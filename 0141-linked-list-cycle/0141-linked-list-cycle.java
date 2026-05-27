/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null ) return false;

        ListNode slow = head;
        ListNode fast = head ;
        while ( fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
            return true;
            }
        }
        return false;
    }
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter number of nodes: ");
    //     int n = sc.nextInt();

    //     if (n == 0) {
    //         System.out.println("List is empty");
    //         return;
    //     }

    //     // Create list
    //     System.out.println("Enter elements:");
    //     ListNode head = new ListNode(sc.nextInt());
    //     ListNode current = head;

    //     List<ListNode> nodes = new ArrayList<>();
    //     nodes.add(head);

    //     for (int i = 1; i < n; i++) {
    //         current.next = new ListNode(sc.nextInt());
    //         current = current.next;
    //         nodes.add(current);
    //     }

    //     // Create cycle manually
    //     System.out.print("Enter position to connect tail (-1 for no cycle): ");
    //     int pos = sc.nextInt();

    //     if (pos != -1) {
    //         current.next = nodes.get(pos);
    //     }

    //     // Check cycle
    //     boolean result = hasCycle(head);

    //     System.out.println("Cycle present? " + result);
    // }
}