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
      public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        // if(fast!=null){
        //     slow=slow.next;
        //  }
    
        slow=reverseList(slow);
         fast=head;
         while (slow!=null) {

            if(slow.val !=fast.val){
                return false;
            } 
            fast=fast.next;
            slow=slow.next;           
        }
    return true;
        
    }
     public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next==null){
            return head;
        }

        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
        ListNode nextnode=curr.next;

        curr.next=prev;
        prev=curr;
        curr=nextnode;

        }
        
        return prev;
                
    }  

    
}