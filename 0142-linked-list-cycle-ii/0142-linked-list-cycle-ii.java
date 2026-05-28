// import java.util.*;
// class ListNode {
//     int val ;
//     ListNode next;
//     ListNode (){}
//     ListNode (int val){
//         this.val = val;
        
//     }
//     ListNode ( int val , ListNode next){
//         this.val= val;
//         this.next = next;
//     }
// }
class Solution {
    public static ListNode detectCycle ( ListNode head ){
        if ( head == null){
            return null;
        }
        ListNode slow = head; 
        ListNode fast = head;
        while ( fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if ( slow == fast ){
                 ListNode temp  = head;
                 while ( temp != slow){
                     temp= temp.next;
                     slow = slow.next;
                 }
                 return temp;
            }
        }
        return null;
    }
//     public static void main (String [] args){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         if( n== 0){
//             return;
//         }
//         ListNode head = new ListNode (sc.nextInt());
//         ListNode current = head;
        
//         List <ListNode> nodes = new ArrayList<>();
//         nodes.add(head);
        
//         for ( int i =1; i<n;i++){
//             current.next = new ListNode(sc.nextInt());
//             current = current.next;
//             nodes.add(current);
//         }
//         int pos = sc.nextInt();
//         if( pos!=-1){
//             if( pos >=0 && pos< nodes.size()){
//             current.next = nodes.get(pos);
            
//         }else {
//             System.out.println("invalid position");
//         }
//     }
//     ListNode result = detectCycle(head);
//     if( result != null){
//         System.out.println("Cycle start with"+ result.val);
//     }else {
//         System.out.println("No cycle");
//     }
// }
    
}