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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode t1=l1;
        ListNode t2=l2;
       Stack<Integer> st1 = new Stack<>();
Stack<Integer> st2 = new Stack<>();

     

ListNode head = null;


        while(t1!=null){
            st1.push(t1.val);
            t1=t1.next;
        }
           while(t2!=null){
            st2.push(t2.val);

            t2=t2.next;
        }
int carry=0;
     while (!st1.isEmpty() || !st2.isEmpty() || carry != 0) {
    int sum = carry;
    if (!st1.isEmpty()) sum += st1.pop();
    if (!st2.isEmpty()) sum += st2.pop();
    carry = sum / 10;
    ListNode node = new ListNode(sum % 10);
    node.next = head;
    head = node;
}

return head;
              
    }
}