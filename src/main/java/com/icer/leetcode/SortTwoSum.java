package com.icer.leetcode;

public class SortTwoSum {

    public int[] twoSum(int[] numbers, int target) {
        //double pointer
        int[] indices = new int[2];
        if (numbers == null || numbers.length < 2) return indices;
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                indices[0] = left + 1;
                indices[1] = right + 1;
                return indices;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return indices;
    }

}
