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
           ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;  // Last node in the result list
        ListNode curr = head;
        while(curr!=null){
              if (curr.next != null && curr.val != curr.next.val) {
                prev.next=curr;
                prev=prev.next;
              }else if(curr.next==null){
                prev.next=curr;

              }





            curr=curr.next;
        }

        return dummy.next;
        
    }
}