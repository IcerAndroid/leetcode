package com.icer.leetcode;

public class RemoveDuplicatesSortList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fakeNode = new ListNode(0);
        fakeNode.next = head;
        ListNode pre = fakeNode;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return fakeNode.next;
    }
}
