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
    public ListNode detectCycle(ListNode head) {

        
       
           ListNode ptr=head;
        ListNode ptr1=head;
        ListNode ptr3=head;

  
      

        while(ptr!=null && ptr1!=null && ptr1.next!=null){
            

          
            ptr=ptr.next;
             ptr1=ptr1.next.next;
               if(ptr==ptr1){
                
               while(ptr!=ptr3){
              ptr=ptr.next;
             ptr3=ptr3.next;
               }
              return ptr3;
             
            
             
              }
        }
        return null;
        
    }
}