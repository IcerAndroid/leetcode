package com.icer.leetcode;

public class BinarySearch {
    /**
     * 标准的二分查找
     * @param array
     * @param target
     * @return
     */
    static int find(int[] array, int target) {
        if (array.length == 0) return -1;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7};
        int index = rightbound(arr, 7);
        System.out.println(index);
    }

    /**
     * 左边界二分查找
     * @param array
     * @param target
     * @return
     */
    static int leftbound(int[] array, int target) {
        if (array.length == 0) return -1;
        int start = 0;
        int end = array.length;
        while (start < end) {
            int mid = (start + end) >> 1;
            if (array[mid] == target) {
                end = mid;
            } else if (array[mid] > target) {
                end = mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            }
        }
        if (start == array.length) return -1;
        return array[start] == target ? start : -1;
    }

    /**
     * 右边界二分查找
     * @param arr
     * @param target
     * @return
     */
    static int rightbound(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) >> 1;
            if (arr[mid] == target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid;
            }
        }
        if (start == 0) return -1;

        return arr[start - 1] == target ? start - 1 : -1;
    }
}
