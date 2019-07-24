package com.icer.leetcode;

/**
 * 53. Maximum Subarray
 * 动态规划
 * maxSubArray(A,i)=A[i]+maxSubArray(A,i-1)>0?maxSubArray(A,i-1):0
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
//
//    public static void main(String[] args) {
//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        MaximumSubarray app = new MaximumSubarray();
//        int max = app.maxSubArray(arr);
//        System.out.println(max);
//    }
}
