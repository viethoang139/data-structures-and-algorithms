package org.example.leetcode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode first = head;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            int temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;
            curr = curr.next.next;
        }
        return first;
    }
}
