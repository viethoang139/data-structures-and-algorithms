package org.example.leetcode;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode L = head ,  R = reverse(slow);
        while(L != null && R != null){
            ListNode next1 = L.next;
            ListNode next2 = R.next;
            L.next = R ;
            R.next = next1 == null ? next2 : next1;
            L = next1;
            R = next2;
        }
    }

    private ListNode reverse(ListNode node){
        ListNode pre = null;
        ListNode curr = node;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
