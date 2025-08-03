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
     

    

       
           ListNode ptr=head;
        ListNode ptr1=head;

        while(ptr!=null && ptr1!=null && ptr1.next!=null){
            

          
            ptr=ptr.next;
             ptr1=ptr1.next.next;
               if(ptr==ptr1){
                return true;
            }

        }
   
        return false;
        
    }
}