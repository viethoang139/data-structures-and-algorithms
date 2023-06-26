package org.example.leetcode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = null;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0 ; i < n ; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = slow.next;
        return dummy.next;



    }
}
