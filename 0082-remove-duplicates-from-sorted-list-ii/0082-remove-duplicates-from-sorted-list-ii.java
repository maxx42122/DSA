class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;  // Last node in the result list
        ListNode curr = head;  // Last node in the result list

        while (curr != null) {
            // Check for duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                int duplicateVal = curr.val;
               
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;  // Disconnect duplicates
            } else {
                prev = prev.next;
    
            }
            curr=curr.next;
        }

        return dummy.next;
    }
}
