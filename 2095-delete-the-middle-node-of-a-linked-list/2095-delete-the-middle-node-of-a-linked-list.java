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
 public ListNode deleteMiddle(ListNode head) {

        ListNode dummy=new ListNode(-1);

        dummy.next=head;
        if(head==null || head.next==null)return null;
    
         ListNode temp2=head;

        while(temp2!=null && temp2.next!=null){
            dummy=dummy.next;
            temp2=temp2.next.next;
        }
        dummy.next=dummy.next.next;

        return head;
        
    }

}