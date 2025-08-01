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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int count =1;
        ListNode cnt=head;
       
        while(cnt.next!=null){
            count++;
            cnt=cnt.next;
           
        }
        cnt.next=head;
    k=k%count;
        ListNode ptr=head;
        int i=1;
        while(i<(count-k)){
            ptr=ptr.next;
          
            i++;
        }
        
           ListNode newHead = ptr.next;
    ptr.next = null;

          return newHead;   

    }
}