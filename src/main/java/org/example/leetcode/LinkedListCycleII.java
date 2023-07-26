package org.example.leetcode;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s = s.next;
            length--;
        }

        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    private int lengthCycle(ListNode slow){
        int length = 0;
        ListNode temp = slow;
        do{
            temp = temp.next;
            length++;
        }while(temp != slow);
        return length;
    }
}
