package org.example.leetcode;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode pre = dummy;
        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);
        int carry = 0;
        while(list1 != null || list2 != null){
            int v1 = (list1 != null)? list1.val : 0;
            int v2 = (list2 != null)? list2.val : 0;
            int sum = v1 + v2 + carry;
            carry = 0;
            if(sum > 9){
                carry++;
            }
            ListNode list = new ListNode(sum % 10);
            pre.next = list;
            pre = list;
            list1 = (list1 != null)? list1.next : null;
            list2 = (list2 != null)? list2.next : null;
        }
        if(carry != 0){
            ListNode temp = new ListNode(1);
            pre.next = temp;
        }
        return reverseResult(dummy.next);
    }

    private ListNode reverseResult(ListNode node){
        ListNode temp = node;
        ListNode pre = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }

    private ListNode reverse(ListNode node){
        ListNode temp = node;
        ListNode pre = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }
}
