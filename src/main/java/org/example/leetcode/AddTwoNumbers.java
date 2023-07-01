package org.example.leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode pre = dummy;
        int carry = 0;
        while(l1 != null || l2 != null){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int sum = v1 + v2 + carry;
            carry = 0;
            if(sum > 9){
                carry++;
            }
            ListNode list = new ListNode(sum % 10);
            pre.next = list;
            pre = list;
            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)?l2.next : null;
        }
        if(carry != 0){
            ListNode result = new ListNode(1);
            pre.next = result;
        }
        return dummy.next;
    }
}
