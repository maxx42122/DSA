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
    public ListNode sortList(ListNode head) {
    ListNode temp=head;
    List <Integer>arr=new ArrayList();
    while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
        
    }
    Collections.sort(arr);
int j=0;
  ListNode res=new ListNode(0);
     ListNode temp1=res;
   
    while(j<arr.size()){
        temp1.next=new ListNode(arr.get(j));
        temp1=temp1.next;  
        j++;     
    }
    return res.next;

        
    }
}