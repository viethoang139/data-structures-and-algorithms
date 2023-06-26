package org.example.leetcode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode list = new ListNode();
        ListNode temp = list;
        while(curr != null ){
            if(curr.val == val){
                temp.next = curr.next;
                curr = temp.next;
            }
            else{
                temp.next = curr;
                temp = curr;
                curr = curr.next;
            }
        }
        return list.next;
    }
}
