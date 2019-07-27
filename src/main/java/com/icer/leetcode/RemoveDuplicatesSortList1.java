package com.icer.leetcode;

public class RemoveDuplicatesSortList1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null) {
            if (list.next == null) break;
            if (list.val == list.next.val) {
                list.next = list.next.next;//容易写成list=list.next.next
            } else {
                list = list.next;
            }
        }
        return head;
    }
}
