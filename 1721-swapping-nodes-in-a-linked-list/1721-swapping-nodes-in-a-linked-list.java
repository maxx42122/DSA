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
    public ListNode swapNodes(ListNode head, int k) {

        int cnt=0;
        ListNode count=head;
        while(count!=null){
            cnt++;
            count=count.next;
        }

       

      

         ListNode temp1=head;
        int y=k;
            while (y-1!=0) {
               
                
                temp1=temp1.next;   
      
                y--;
            }
            

              int x=cnt-k;
            ListNode temp2=head;
            while (x!=0) {
               
                
                temp2=temp2.next;   
                cnt++;        
                x--;

            
            } 
             int temp = temp1.val;
        temp1.val = temp2.val;
        temp2.val = temp; 

        return head;
        
    }
}