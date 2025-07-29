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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         
       
        ListNode temp1=head;
        int cnt=0;

        while(temp1!=null){
            cnt++;
            temp1=temp1.next;
        }
        int x=cnt-n;
          
          ListNode temp=head;
            if(x==0){
                head=head.next;
            }else 
            {
            while (x-1!=0) {
               
                
                temp=temp.next;   
                 
                x--;

            }
               temp.next=temp.next.next;
            }  
            return head;
        
    }

   
}