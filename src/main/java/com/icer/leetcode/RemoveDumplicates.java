package com.icer.leetcode;

import java.util.Arrays;

public class RemoveDumplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 6};
        removeDumplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int removeDumplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int slow = 0, fast = 1;
        while (fast < len) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    static ListNode removeDumplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head.next;
        while (fast.next != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = fast;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}
