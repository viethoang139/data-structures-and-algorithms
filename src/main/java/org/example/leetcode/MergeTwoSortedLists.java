package org.example.leetcode;

public class MergeTwoSortedLists {
    // solution 1
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode head = new ListNode();
//        ListNode tail = head;
//        while(l1 != null || l2 != null){
//            if(l2 == null || (l1 != null && l1.val < l2.val)){
//                tail.next = l1;
//                tail = l1;
//                l1 = l1.next;
//            }
//            else{
//                tail.next = l2;
//                tail = l2;
//                l2 = l2.next;
//            }
//        }
//        return head.next;
//    }

    // solution 2
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode pre = ans;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                pre.next = list1;
                list1 = list1.next;
            }
            else{
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 != null ? list1 : list2;
        return ans.next;
    }
}
