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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> sum=new ArrayList();
        ListNode temp1=list1;
        while(temp1!=null){
            sum.add(temp1.val);
            temp1=temp1.next;
        }
        ListNode temp2=list2;
        while(temp2!=null){
            sum.add(temp2.val);
            temp2=temp2.next;
        }

        Collections.sort(sum);

        ListNode result=new ListNode(0);
        ListNode temp3=result;

        for(int i=0;i<sum.size();i++){
            temp3.next=new ListNode(sum.get(i));
            temp3=temp3.next;
        }

        return result.next;
        
    }
}