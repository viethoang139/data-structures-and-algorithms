package org.example.leetcode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode L = head;
        ListNode R = reverse(slow);
        while(R != null){
            if(L.val == R.val){
                L = L.next;
                R = R.next;
            }
            else{
                return false;
            }
        }
        return true;
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
